package jacreator.spring.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Vets")
public class Vet extends Person {

    @ManyToMany
    @JoinTable(name = "vets_specialities",  joinColumns = @JoinColumn(name = "vets_id"),
            inverseJoinColumns = @JoinColumn(name = "specialities_id"))
    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
