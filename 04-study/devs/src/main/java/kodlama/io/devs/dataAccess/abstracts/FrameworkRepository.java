package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.concrates.Framework;

public interface FrameworkRepository extends JpaRepository<Framework, Integer> {

}
