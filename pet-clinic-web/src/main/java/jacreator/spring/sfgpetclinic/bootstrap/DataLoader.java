package jacreator.spring.sfgpetclinic.bootstrap;

import jacreator.spring.sfgpetclinic.mdoel.Owner;
import jacreator.spring.sfgpetclinic.mdoel.PetType;
import jacreator.spring.sfgpetclinic.mdoel.Vet;
import jacreator.spring.sfgpetclinic.services.OwnerService;
import jacreator.spring.sfgpetclinic.services.PetTypeService;
import jacreator.spring.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

//        Adding PetType
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat); // saving and passing the result into a variable

//        Adding PetType
        PetType lion = new PetType();
        cat.setName("Lion");
        PetType savedLionPetType = petTypeService.save(lion); // saving and passing the result into a variable

//        passing out Pettype data out
        System.out.println("PetType loaded...");

//        Adding Owner 1
        Owner user1 = new Owner();

        user1.setFirstName("James");
        user1.setLastName("Adakole");

        ownerService.save(user1);  // saving of user 1

//        adding Owner 2
        Owner user2 = new Owner();

        user2.setFirstName("Blessing");
        user2.setLastName("Otokpa");

        ownerService.save(user2);

//        passing owner load info out
        System.out.println("Owners Loaded...");

//        Adding Vet user 1
        Vet vetUser1 = new Vet();

        vetUser1.setFirstName("Lizzy");
        vetUser1.setLastName("B");

        vetService.save(vetUser1); // saving Vet user 1

        Vet vetUser2 = new Vet();

        vetUser2.setFirstName("Joe");
        vetUser2.setLastName("Lewis");

        vetService.save(vetUser2);

//        passing vet details out
        System.out.println("Vet Loaded...");
    }
}
