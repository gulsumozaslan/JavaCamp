package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() +" kategorisi Jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getCategoryName() +" kategorisi Jdbc ile silindi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getCategoryName() +" kategorisi Jdbc ile güncellendi");
		
	}

}
