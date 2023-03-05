package kodlama.io.devs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concrates.ProgrammingLanguage;

@RestController
@RequestMapping("api/v1/programminglanguage/")
@CrossOrigin
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("getall")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("{id}")
    public ProgrammingLanguage getById(@PathVariable(name = "id", required = true) int id) {
        return programmingLanguageService.getById(id);
    }

    @PostMapping()
    public void addProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.add(programmingLanguage);
    }

    @PutMapping("{id}")
    public void updateProgrammingLanguage(@PathVariable(name = "id", required = true) int id,
            @RequestBody ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.update(id, programmingLanguage);
    }

    @DeleteMapping("{id}")
    public void deleteProgrammingLanguage(@PathVariable(name = "id", required = true) int id) {
        programmingLanguageService.delete(id);
    }
}
