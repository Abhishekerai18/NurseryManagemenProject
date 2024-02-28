package com.example.NurseryManagementSystem.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name="plantData")
public class plantModel {

	@Id
//	@Column(name="Email")
	private String id="idOfPlant";
	
	
	private String name="name";
	private String breed="breed";
	private String season="season";
	private String country="country";
	public String getId() {
		return id;
	}
	
	public plantModel() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "plantModel [id=" + id + ", name=" + name + ", breed=" + breed + ", season=" + season + ", country="
				+ country + "]";
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
}
