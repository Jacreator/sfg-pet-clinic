package jacreator.spring.sfgpetclinic.services;

import java.util.Set;

public interface PetService {
    PetService findById(Long id);
    PetService save(PetService pet);
    Set<PetService> findAll();
}
