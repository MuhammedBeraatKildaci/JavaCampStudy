package dataaccess.abstracts;

import entity.Course;

public interface CourseRepository {
    void add(Course course);
    void update(int id,Course course);
    void delete(int id);
    void getAll();
    void getById(int id);
}
