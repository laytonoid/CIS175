package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="force_users")
public class ForceUser {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LIGHTSABER_COLOR")
	private String lightsaberColor;
	
	@Column(name="AFFILIATION")
	private String affiliation;

	public ForceUser() {
		super();
	}

	public ForceUser(String name, String lightsaberColor, String affiliation) {
		super();
		this.name = name;
		this.lightsaberColor = lightsaberColor;
		this.affiliation = affiliation;
	}
	
	public ForceUser(String name) {
	    this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLightsaberColor() {
		return lightsaberColor;
	}

	public void setLightsaberColor(String lightsaberColor) {
		this.lightsaberColor = lightsaberColor;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	
	public String returnForceUserDetails() {
		return name + " wields a " + lightsaberColor + " lightsaber and is affiliated with the " + affiliation;
	}
}