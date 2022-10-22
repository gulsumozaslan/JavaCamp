package kodlamaioDemo.business;

import kodlamaioDemo.dataAccess.InstructorDao;
import kodlamaioDemo.entities.Instructor;

public class InstructorManager {

	InstructorDao instructorDao;

	public InstructorManager(InstructorDao instructorDao) {
		this.instructorDao = instructorDao;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);

	}

	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}

	public void update(Instructor instructor) {
		instructorDao.update(instructor);
	}

}
