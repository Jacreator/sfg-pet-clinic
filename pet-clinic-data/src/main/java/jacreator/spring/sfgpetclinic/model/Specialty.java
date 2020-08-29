package jacreator.spring.sfgpetclinic.mdoel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Specialities")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
