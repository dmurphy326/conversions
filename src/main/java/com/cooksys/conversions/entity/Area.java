package com.cooksys.conversions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Area")
public class Area {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "AreaVal")
	private long areaVal;

	@Column(name = "Hits")
	private long hits;

	@Column(name = "Conversions")
	private long conversions;

	public Area() {
	}

	public Area(long areaVal) {
		this.areaVal = areaVal;
		this.hits = 0;
		this.conversions = 0;
	}

	public Area(long areaVal, long hits, long conversions) {
		this.areaVal = areaVal;
		this.hits = hits;
		this.conversions = conversions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAreaVal() {
		return areaVal;
	}

	public void setAreaVal(long areaVal) {
		this.areaVal = areaVal;
	}

	public long getHits() {
		return hits;
	}

	public void setHits(long hits) {
		this.hits = hits;
	}

	public long getConversions() {
		return conversions;
	}

	public void setConversions(long conversions) {
		this.conversions = conversions;
	}

}
