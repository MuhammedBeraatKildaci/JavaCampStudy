package business;

import dataaccess.abstracts.CategoryRepository;
import entity.Category;
import utility.logging.Logger;

public class CategoryManager {
    private Logger[] loggers;
    private CategoryRepository categoryRepository;

    public CategoryManager(Logger[] loggers, CategoryRepository categoryRepository) {
        this.loggers = loggers;
        this.categoryRepository = categoryRepository;
    }

    public void add(Category category) {
        Category[] categories = new Category[]{new Category(2,"Yazılım Geliştirme")};
        for (var c : categories) {
            if(!category.getName().equals(c.getName())){
                categoryRepository.add(category);
            }else{
                System.err.println("Kategori eklenemedi");
            }
            for(Logger logger : loggers){
                logger.log(category.getName()+" added");
            }
        }
           
            
    }
}
