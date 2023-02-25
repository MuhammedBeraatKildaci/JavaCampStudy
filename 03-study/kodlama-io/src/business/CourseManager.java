package business;

import dataaccess.abstracts.CourseRepository;
import entity.Course;
import utility.logging.Logger;

public class CourseManager {
    private Logger[] loggers;
    private CourseRepository courseRepository;

    public CourseManager(Logger[] loggers, CourseRepository courseRepository) {
        this.loggers = loggers;
        this.courseRepository = courseRepository;
    }

    public void add(Course course) {
        Course[] courses = new Course[]{new Course(1,"Java","Java and React Js",69.99)};
            for (var c : courses) {
                
            if(!course.getName().equals(c.getName()) && course.getPrice() > 0){
                courseRepository.add(course);
            }else{
                System.err.println("kurs eklenemedi");
            }
            for(Logger logger : loggers){
                logger.log(course.getName()+" added");
            }
        }    

    }
}
