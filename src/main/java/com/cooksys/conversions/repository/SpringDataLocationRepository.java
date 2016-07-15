package com.cooksys.conversions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.conversions.entity.Area;
import com.cooksys.conversions.entity.Location;

public interface SpringDataLocationRepository extends JpaRepository<Location, Long> {

	// finds area by its value, which should be unique and returns the hits
	// **LocationHit, GET method**
	public Area findByAreaAreaVal(long areaVal);

	// finds area by value
	// **Location, Login, RegisterUser, GET method**
	// public Area findByArea(long areaVal); ***may not need

	// finds a list of locations associated with an area
	// **Location**
	public List<Location> findAllByArea(Area area);
}
