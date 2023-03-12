package kodlama.io.devs.business.concrates;

import java.util.List;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.devs.entities.concrates.Framework;

public class FrameworkManager implements FrameworkService {

    private FrameworkRepository frameworkRepository;

    public FrameworkManager(FrameworkRepository frameworkRepository) {
        this.frameworkRepository = frameworkRepository;
    }

    @Override
    public List<Framework> getAll() {
        return frameworkRepository.findAll();
    }

    @Override
    public Framework getById(int id) {
        return frameworkRepository.findById(id).orElseThrow();
    }

    @Override
    public void add(Framework framework) {
        frameworkRepository.save(framework);
    }

    @Override
    public void update(int id, Framework framework) {
        Framework frm = getById(id);
        framework.setName(frm.getName());
        frameworkRepository.save(frm);
    }

    @Override
    public void delete(int id) {
        frameworkRepository.delete(getById(id));
    }

}
