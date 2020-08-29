package jacreator.spring.sfgpetclinic.bootstrap;

import jacreator.spring.sfgpetclinic.model.*;
import jacreator.spring.sfgpetclinic.services.OwnerService;
import jacreator.spring.sfgpetclinic.services.PetTypeService;
import jacreator.spring.sfgpetclinic.services.SpecialitiesService;
import jacreator.spring.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0 ){
            loadData();
        }

    }

    private void loadData() {
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

//        Specialties
        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery = specialitiesService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry = specialitiesService.save(dentistry);

//        Adding Owner 1
        Owner user1 = new Owner();

        user1.setFirstName("James");
        user1.setLastName("Adakole");
        user1.setAddress("123 airport Road");
        user1.setCity("Abuja");
        user1.setTelephone("+2348161883854");

        //        Adding Pet
        Pet jamesPet = new Pet();
        jamesPet.setPetType(savedCatPetType);
        jamesPet.setOwner(user1);
        jamesPet.setName("rco");
        jamesPet.setBirthDate(LocalDate.now());
        user1.getPets().add(jamesPet);

        ownerService.save(user1);  // saving of user 1

//        adding Owner 2
        Owner user2 = new Owner();

        user2.setFirstName("Blessing");
        user2.setLastName("Otokpa");
        user1.setAddress("123 any where in the world");
        user1.setCity("Toronto");
        user1.setTelephone("1231234543");

        //        Adding Pet
        Pet blessingPet = new Pet();
        blessingPet.setPetType(savedLionPetType);
        blessingPet.setOwner(user2);
        blessingPet.setName("brave");
        blessingPet.setBirthDate(LocalDate.now());
        user1.getPets().add(blessingPet);

        ownerService.save(user2);

//        passing owner load info out
        System.out.println("Owners Loaded...");

//        Adding Vet user 1
        Vet vetUser1 = new Vet();

        vetUser1.setFirstName("Lizzy");
        vetUser1.setLastName("B");
        vetUser1.getSpecialties().add(savedDentistry);

        vetService.save(vetUser1); // saving Vet user 1

        Vet vetUser2 = new Vet();

        vetUser2.setFirstName("Joe");
        vetUser2.setLastName("Lewis");
        vetUser2.getSpecialties().add(savedSurgery);
        vetService.save(vetUser2);

//        passing vet details out
        System.out.println("Vet Loaded...");
    }
}
