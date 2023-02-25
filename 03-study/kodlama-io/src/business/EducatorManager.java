package business;

import dataaccess.abstracts.EducatorRepository;
import entity.Educator;
import utility.logging.Logger;

public class EducatorManager {
    private Logger[] loggers;
    private EducatorRepository educatorRepository;

    public EducatorManager(Logger[] loggers, EducatorRepository educatorRepository) {
        this.loggers = loggers;
        this.educatorRepository = educatorRepository;
    }

    public void add(Educator educator){
        educatorRepository.add(educator);
        for(Logger logger : loggers){
            logger.log(educator.getFirstName()+" "+ educator.getLastName()+" added");
        }
    }
}
