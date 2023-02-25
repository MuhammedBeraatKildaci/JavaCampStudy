package dataaccess.concrates.jdbc;

import dataaccess.abstracts.CategoryRepository;
import entity.Category;

public class JCategoryDal implements CategoryRepository{

    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile eklendi.");
    }

    @Override
    public void remove(int id) {
        System.out.println("Kategori JDBC ile silindi.");
    }

    @Override
    public void update(int id, Category category) {
        System.out.println("Kategori JDBC ile güncellendi.");
    }

    @Override
    public void getAll() {
        System.out.println("Kategori listesi JDBC ile getirildi.");
    }

    @Override
    public void getById(int id) {
        System.out.println("Kategori JDBC ile getirildi.");
    }
    
}

