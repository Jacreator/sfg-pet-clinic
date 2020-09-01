package jacreator.spring.sfgpetclinic.repositories;

import jacreator.spring.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
