package dmacc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Planet;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PlanetRepository;
import dmacc.beans.Species;

@SpringBootApplication
public class SpringStarWarsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringStarWarsApplication.class, args);
    }

    @Autowired
    PlanetRepository repo;

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Planet planet = appContext.getBean("planet", Planet.class);
        repo.save(planet);

        List<Planet> allPlanets = repo.findAll();
        for (Planet p : allPlanets) {
            System.out.println(p.toString());
        }
        ((AbstractApplicationContext) appContext).close();
    }
}