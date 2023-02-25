package dataaccess.concrates.hibernate;

import dataaccess.abstracts.EducatorRepository;
import entity.Educator;

public class HbEducatorDal implements EducatorRepository{
    @Override
    public void add(Educator educator) {
        System.out.println("Eğitmen Hibernate ile eklendi.");
    }

    @Override
    public void update(int id, Educator educator) {
        System.out.println("Eğitmen Hibernate ile güncellendi.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Eğitmen Hibernate ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Eğitmen listesi Hibernate ile getirildi.");
    }

    @Override
    public void getById(int id) {
        System.out.println("Eğitmen Hibernate ile getirildi.");
    }
    
}
