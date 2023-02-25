package dataaccess.abstracts;

import entity.Educator;

public interface EducatorRepository {
    void add(Educator educator);
    void update(int id, Educator educator);
    void delete(int id);
    void getAll();
    void getById(int id);
}
