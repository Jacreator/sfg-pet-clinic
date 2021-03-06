package jacreator.spring.sfgpetclinic.controllers;

import jacreator.spring.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"", "/index", "/index.html", "/vets.html"})
    public String list(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
