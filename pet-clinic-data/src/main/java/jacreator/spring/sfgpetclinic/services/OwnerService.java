package jacreator.spring.sfgpetclinic.services;

import jacreator.spring.sfgpetclinic.mdoel.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String LastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
