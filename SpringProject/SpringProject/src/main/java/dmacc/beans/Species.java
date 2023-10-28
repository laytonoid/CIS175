package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String classification;
    private int averageLifespan;

    public Species() {
        // Default constructor
    }

    public Species(String name, String classification, int averageLifespan) {
        this.name = name;
        this.classification = classification;
        this.averageLifespan = averageLifespan;
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
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @param classification the classification to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}

	/**
	 * @return the averageLifespan
	 */
	public int getAverageLifespan() {
		return averageLifespan;
	}

	/**
	 * @param averageLifespan is averageLifespan to set
	 */
	public void setAverageLifespan(int averageLifespan) {
		this.averageLifespan = averageLifespan;
	}
	
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}