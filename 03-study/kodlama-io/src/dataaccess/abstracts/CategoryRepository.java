package dataaccess.abstracts;

import entity.Category;

public interface CategoryRepository {
    void add(Category category);
    void remove(int id);
    void update(int id,Category category);
    void getAll();
    void getById(int id);
}
