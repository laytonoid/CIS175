package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Planet;
import dmacc.beans.Species;

@Configuration
public class BeanConfiguration {

    @Bean
    public Planet planet() {
        Planet planet = new Planet();
        planet.setName("Endor");
        planet.setClimate("Humid");
        planet.setTerrain("Forests");
        planet.setPopulation(10000);
        planet.setDominantSpecies(species()); 
        return planet;
    }

    @Bean
    public Species species() {
        return new Species("Ewok", "Mammal", 400);
    }
}