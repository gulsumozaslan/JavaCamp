package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private List<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, List<Course> courses, Logger[] loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	
	public void add(Course course) throws Exception {
		if (course.getPrice()<0 ) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
		}
		for (Course courseItem : courses) {
			if (course.getCourseName().equals(courseItem.getCourseName())) {
				throw new Exception("Belirtilen kurs adı sisteme kayıtlıdır");
			}
		}
		courseDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}
	
	public void delete(Course course) {
		courseDao.delete(course);
		
	}

	
	public void update(Course course) {
		courseDao.update(course);
		
	}

}
