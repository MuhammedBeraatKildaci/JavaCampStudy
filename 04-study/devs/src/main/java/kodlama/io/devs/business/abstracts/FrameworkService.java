package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concrates.Framework;

public interface FrameworkService {
    List<Framework> getAll();

    Framework getById(int id);

    void add(Framework framework);

    void update(int id, Framework framework);

    void delete(int id);
}
