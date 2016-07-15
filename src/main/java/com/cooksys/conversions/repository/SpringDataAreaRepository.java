package com.cooksys.conversions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.conversions.entity.Area;

public interface SpringDataAreaRepository extends JpaRepository<Area, Long> {

	// returns all areas
	// **GET method**
	public List<Area> findAll();

	// returns area
	public Area findByAreaVal(long areaVal);

}
