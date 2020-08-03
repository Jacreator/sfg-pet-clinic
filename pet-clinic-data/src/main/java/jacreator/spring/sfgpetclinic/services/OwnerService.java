package jacreator.spring.sfgpetclinic.services;

import jacreator.spring.sfgpetclinic.mdoel.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String LastName);

}
