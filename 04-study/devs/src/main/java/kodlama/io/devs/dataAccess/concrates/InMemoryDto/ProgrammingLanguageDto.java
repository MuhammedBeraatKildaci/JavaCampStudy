package kodlama.io.devs.dataAccess.concrates.InMemoryDto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concrates.ProgrammingLanguage;

@Repository
public class ProgrammingLanguageDto implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public ProgrammingLanguageDto() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1, "c"));
        programmingLanguages.add(new ProgrammingLanguage(2, "c++"));
        programmingLanguages.add(new ProgrammingLanguage(3, "c#"));
        programmingLanguages.add(new ProgrammingLanguage(4, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(5, "JavaScript"));
        programmingLanguages.add(new ProgrammingLanguage(6, "Php"));
        programmingLanguages.add(new ProgrammingLanguage(7, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(8, "Ruby"));
        programmingLanguages.add(new ProgrammingLanguage(9, "Swift"));
        programmingLanguages.add(new ProgrammingLanguage(10, "Kotlin"));
        programmingLanguages.add(new ProgrammingLanguage(11, "Dart"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage prglng : programmingLanguages) {
            if (prglng.getId() == id) {
                prglng.setName(programmingLanguage.getName());
            } else {
                System.out.println("programlama dili bulunamadi");
            }
        }
    }

    @Override
    public void delete(int id) {
        for (ProgrammingLanguage prglng : programmingLanguages) {
            if (prglng.getId() == id) {
                programmingLanguages.remove(prglng.getId());
            } else {
                System.out.println("programlama dili bulunamadi");
            }
        }
    }

}
