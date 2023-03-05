package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concrates.ProgrammingLanguage;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage);
    void update(int id,ProgrammingLanguage programmingLanguage);
    void delete(int id);
}
