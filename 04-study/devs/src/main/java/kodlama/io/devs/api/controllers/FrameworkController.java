package kodlama.io.devs.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.entities.concrates.Framework;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/framework/")
@CrossOrigin
@RequiredArgsConstructor
public class FrameworkController {
    private FrameworkService frameworkService;

    @GetMapping("getall")
    public List<Framework> getAll() {
        return frameworkService.getAll();
    }

    @GetMapping("{id}")
    public Framework getById(@PathVariable(name = "id", required = true) int id) {
        return frameworkService.getById(id);
    }

    @PostMapping()
    public void addProgrammingLanguage(@RequestBody Framework programmingLanguage) {
        frameworkService.add(programmingLanguage);
    }

    @PutMapping("{id}")
    public void updateProgrammingLanguage(@PathVariable(name = "id", required = true) int id,
            @RequestBody Framework programmingLanguage) {
        frameworkService.update(id, programmingLanguage);
    }

    @DeleteMapping("{id}")
    public void deleteProgrammingLanguage(@PathVariable(name = "id", required = true) int id) {
        frameworkService.delete(id);
    }
}
