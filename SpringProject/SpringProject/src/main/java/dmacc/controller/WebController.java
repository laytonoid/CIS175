package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Planet;
import dmacc.beans.Species;
import dmacc.repository.PlanetRepository;
//import dmacc.repository.SpeciesRepository;

/**  
* Taylor Layton - tglayton
* CIS171 22149
* Oct 22, 2023
* Windows 10 
*/

@Controller
public class WebController {
    
    @Autowired
    PlanetRepository planetRepo;
    
    //@Autowired
    //SpeciesRepository speciesRepo;

    @GetMapping({"/", "/viewAllPlanets"})
    public String viewAllPlanets(Model model) {
        if(planetRepo.findAll().isEmpty()) {
            return addNewPlanet(model);
        }
        
        model.addAttribute("planets", planetRepo.findAll());
        return "planetResults";
    }
    
    @GetMapping("/inputPlanet")
    public String addNewPlanet(Model model) {
        Planet p = new Planet();
        model.addAttribute("newPlanet", p);
        return "planetInput";
    }

    @PostMapping("/inputPlanet")
    public String addNewPlanet(@ModelAttribute Planet p, Model model) {
        planetRepo.save(p);
        return viewAllPlanets(model);
    }

    @GetMapping("/editPlanet/{id}")
    public String showUpdatePlanet(@PathVariable("id") long id, Model model) {
        Planet p = planetRepo.findById(id).orElse(null);
        model.addAttribute("newPlanet", p);
        return "planetInput";
    }

    @PostMapping("/updatePlanet/{id}")
    public String revisePlanet(Planet p, Model model) {
        planetRepo.save(p);
        return viewAllPlanets(model);
    }

    @GetMapping("/deletePlanet/{id}")
    public String deletePlanet(@PathVariable("id") long id, Model model) {
        Planet p = planetRepo.findById(id).orElse(null);
        planetRepo.delete(p);
        return viewAllPlanets(model);
    }

    // todo: add species?

}