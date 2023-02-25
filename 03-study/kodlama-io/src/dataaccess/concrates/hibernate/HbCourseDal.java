package dataaccess.concrates.hibernate;

import dataaccess.abstracts.CourseRepository;
import entity.Course;

public class HbCourseDal implements CourseRepository{

    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile eklendi.");
    }

    @Override
    public void update(int id, Course course) {
        System.out.println("Kurs Hibernate ile güncellendi.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Kurs Hibernate ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Kurs listesi Hibernate ile getirildi.");
    }

    @Override
    public void getById(int id) {
        System.out.println("Kurs Hibernate ile getirildi.");
    }
    
}
