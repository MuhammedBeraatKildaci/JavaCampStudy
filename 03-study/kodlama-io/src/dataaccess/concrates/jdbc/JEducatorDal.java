package dataaccess.concrates.jdbc;


import dataaccess.abstracts.EducatorRepository;
import entity.Educator;

public class JEducatorDal implements EducatorRepository{
    @Override
    public void add(Educator educator) {
        System.out.println("Eğitmen JDBC ile eklendi.");
    }

    @Override
    public void update(int id, Educator educator) {
        System.out.println("Eğitmen JDBC ile güncellendi.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Eğitmen JDBC ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Eğitmen listesi JDBC ile getirildi.");
    }

    @Override
    public void getById(int id) {
        System.out.println("Eğitmen JDBC ile getirildi.");
    }
    
}

