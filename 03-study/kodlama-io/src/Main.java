import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import dataaccess.concrates.hibernate.HbCategoryDal;
import dataaccess.concrates.hibernate.HbEducatorDal;
import dataaccess.concrates.jdbc.JCourseDal;
import entity.Category;
import entity.Course;
import entity.Educator;
import utility.logging.DatabaseLogger;
import utility.logging.EmailLogger;
import utility.logging.FileLogger;
import utility.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new FileLogger(), new EmailLogger(),new DatabaseLogger()};

        Course course = new Course(1,"Java Yazılım Geliştirme 2022","Kodlama.io java kampı",49.99);
        Educator educator = new Educator(1,"Engin","Demiroğ","engindemirog@kodlama.io","engin123");
        Category category = new Category(1,"Yazılım Geliştirme");
        CategoryManager categoryManager = new CategoryManager(loggers,new HbCategoryDal());
        CourseManager courseManager = new CourseManager(loggers,new JCourseDal());
        EducatorManager educatorManager = new EducatorManager(loggers,new HbEducatorDal());

        categoryManager.add(category);
        courseManager.add(course);
        educatorManager.add(educator);
    }
}
