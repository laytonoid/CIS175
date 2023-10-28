package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

@Entity
public class Planet {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String climate;
    private String terrain;
    private long population;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "species_id")
    private Species dominantSpecies;

    public Planet(String name, String climate, String terrain, long population) {
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.population = population;
    }
    public Planet() {
    }
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the climate
	 */
	public String getClimate() {
		return climate;
	}
	/**
	 * @param climate the climate to set
	 */
	public void setClimate(String climate) {
		this.climate = climate;
	}
	/**
	 * @return the terrain
	 */
	public String getTerrain() {
		return terrain;
	}
	/**
	 * @param terrain the terrain to set
	 */
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	/**
	 * @return the population
	 */
	public long getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(long population) {
		this.population = population;
	}
	
    public Species getDominantSpecies() {
        return dominantSpecies;
    }

    public void setDominantSpecies(Species dominantSpecies) {
        this.dominantSpecies = dominantSpecies;
    }
}