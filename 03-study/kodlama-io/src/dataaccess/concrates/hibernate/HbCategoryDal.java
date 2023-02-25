package dataaccess.concrates.hibernate;

import dataaccess.abstracts.CategoryRepository;
import entity.Category;

public class HbCategoryDal implements CategoryRepository{

    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile eklendi.");
    }

    @Override
    public void remove(int id) {
        System.out.println("Kategori Hibernate ile silindi.");
    }

    @Override
    public void update(int id, Category category) {
        System.out.println("Kategori Hibernate ile güncellendi.");
    }

    @Override
    public void getAll() {
        System.out.println("Kategori listesi Hibernate ile getirildi.");
    }

    @Override
    public void getById(int id) {
        System.out.println("Kategori Hibernate ile getirildi.");
    }
    
}
