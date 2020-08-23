package jacreator.spring.sfgpetclinic.mdoel;

import java.time.LocalTime;

public class Visit extends BaseEntity {
    private LocalTime date;
    private String description;
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
