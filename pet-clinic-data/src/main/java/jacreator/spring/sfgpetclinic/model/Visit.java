package jacreator.spring.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalTime date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
