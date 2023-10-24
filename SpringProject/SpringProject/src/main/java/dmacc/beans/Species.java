package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Species {
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
	 * @param averageLifespan the averageLifespan to set
	 */
	public void setAverageLifespan(int averageLifespan) {
		this.averageLifespan = averageLifespan;
	}
}
