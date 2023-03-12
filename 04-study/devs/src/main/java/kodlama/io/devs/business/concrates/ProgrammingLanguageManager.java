package kodlama.io.devs.business.concrates;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concrates.ProgrammingLanguage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.findAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.findById(id).orElseThrow();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage language = getById(id);
        programmingLanguage.setName(language.getName());
        programmingLanguage.setFrameworks(language.getFrameworks());
        programmingLanguageRepository.save(language);
    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(getById(id));
    }

}
