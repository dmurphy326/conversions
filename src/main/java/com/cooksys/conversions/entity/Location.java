package com.cooksys.conversions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Location")
public class Location {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "LocationName")
	private String locationName;

	@ManyToOne
	@JoinColumn(name = "Area")
	private Area area;

	public Location() {
	}

	public Location(String locationName, Area area) {
		this.locationName = locationName;
		this.area = area;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}
