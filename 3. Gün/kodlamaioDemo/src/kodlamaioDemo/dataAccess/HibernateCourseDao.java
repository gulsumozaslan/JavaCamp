package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() +" kursu Hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println(course.getCourseName() +" kursu Hibernate ile silindi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println(course.getCourseName() +" kursu Hibernate ile güncellendi");		
	}
	

}
