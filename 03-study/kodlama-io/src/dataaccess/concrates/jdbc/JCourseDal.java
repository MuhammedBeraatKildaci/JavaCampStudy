package dataaccess.concrates.jdbc;

import dataaccess.abstracts.CourseRepository;
import entity.Course;

public class JCourseDal implements CourseRepository{

    @Override
    public void add(Course course) {
        System.out.println("Kurs JDBC ile eklendi.");
    }

    @Override
    public void update(int id, Course course) {
        System.out.println("Kurs JDBC ile güncellendi.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Kurs JDBC ile silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Kurs listesi JDBC ile getirildi.");
    }

    @Override
    public void getById(int id) {
        System.out.println("Kurs JDBC ile getirildi.");
    }
    
}
