package jacreator.spring.sfgpetclinic.bootstrap;

import jacreator.spring.sfgpetclinic.mdoel.Owner;
import jacreator.spring.sfgpetclinic.mdoel.Vet;
import jacreator.spring.sfgpetclinic.services.OwnerService;
import jacreator.spring.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner user1 = new Owner();

        user1.setFirstName("James");
        user1.setLastName("Adakole");

        ownerService.save(user1);

        Owner user2 = new Owner();

        user2.setFirstName("Blessing");
        user2.setLastName("Otokpa");

        ownerService.save(user2);
        System.out.println("Owners Loaded...");

        Vet vetUser1 = new Vet();

        vetUser1.setFirstName("Lizzy");
        vetUser1.setLastName("B");

        vetService.save(vetUser1);

        Vet vetUser2 = new Vet();

        vetUser2.setFirstName("Joe");
        vetUser2.setLastName("Lewis");

        vetService.save(vetUser2);

        System.out.println("Vet Loaded...");
    }
}
