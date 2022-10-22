package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() +" kategorisi Hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getCategoryName() +" kategorisi Hibernate ile silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getCategoryName() +" kategorisi Hibernate ile güncellendi");
		
	}

}
