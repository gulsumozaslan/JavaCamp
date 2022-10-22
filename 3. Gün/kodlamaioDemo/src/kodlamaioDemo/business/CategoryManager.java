package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager   {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}


	public void add(Category category) {

		for (Category categoryItem : categories) {
			if (categoryItem.getCategoryName().equals(categoryItem.getCategoryName())) {
				System.out.println("Belirtilen isimde kategori mevcuttur");
			}
		}
		categoryDao.add(category);
		//....
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
	}

	
	public void delete(Category category) {
		categoryDao.delete(category);
		
	}

	
	public void update(Category category) {
		categoryDao.update(category);
		
	}

}
