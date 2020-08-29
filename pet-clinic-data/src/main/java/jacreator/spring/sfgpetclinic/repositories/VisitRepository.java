package jacreator.spring.sfgpetclinic.repositories;

import jacreator.spring.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
