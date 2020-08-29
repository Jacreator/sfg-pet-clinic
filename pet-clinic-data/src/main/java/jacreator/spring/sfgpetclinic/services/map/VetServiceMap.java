package jacreator.spring.sfgpetclinic.services.map;

import jacreator.spring.sfgpetclinic.model.Specialty;
import jacreator.spring.sfgpetclinic.model.Vet;
import jacreator.spring.sfgpetclinic.services.SpecialitiesService;
import jacreator.spring.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitiesService specialitiesService;

    public VetServiceMap(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() >0){
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null){
                    Specialty savedSpecialty = specialitiesService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
