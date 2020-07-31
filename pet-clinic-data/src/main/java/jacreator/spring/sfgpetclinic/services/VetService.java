package jacreator.spring.sfgpetclinic.services;

import jacreator.spring.sfgpetclinic.mdoel.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
