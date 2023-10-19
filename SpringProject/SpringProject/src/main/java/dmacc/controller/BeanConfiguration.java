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
        planet.setClimate("Temperate");
        planet.setTerrain("Forests");
        planet.setPopulation(1000000L);
        return planet;
    }

    @Bean
    public Species species() {
        return new Species("Wookiee", "Mammal", 400);
    }
}