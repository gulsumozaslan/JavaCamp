package kodlamaioDemo;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.core.logging.MailLogger;
import kodlamaioDemo.dataAccess.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		Course javaCourse = new Course(1, 90 , 0, "JAVA - Yazılım Geliştirici Yetiştirme Kampı", "Kurs Programı");
		Course csharpCourse = new Course(2, 60, 0, "C# - Yazılım Geliştirici Yetiştirme Kampı", "Kurs Programı");
		List<Course> courses = new ArrayList<>();

		Logger[] loggers = { new DatabaseLogger(), new MailLogger(), new FileLogger() };

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
		courseManager.add(javaCourse);
		
		System.out.println("------------------------");
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Web Geliştirme");
		
		Category category2 = new Category(1,"Siber güvenlik");
		List<Category> categories = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category1);

	}

}
