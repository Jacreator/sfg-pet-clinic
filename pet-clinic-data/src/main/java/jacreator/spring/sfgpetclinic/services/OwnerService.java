package jacreator.spring.sfgpetclinic.services;

import jacreator.spring.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String LastName);

}
