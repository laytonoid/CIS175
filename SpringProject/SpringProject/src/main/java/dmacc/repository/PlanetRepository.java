package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {}