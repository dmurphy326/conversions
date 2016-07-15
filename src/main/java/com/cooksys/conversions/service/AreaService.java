package com.cooksys.conversions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.conversions.entity.Area;
import com.cooksys.conversions.entity.User;
import com.cooksys.conversions.pojo.LocationHit;
import com.cooksys.conversions.repository.SpringDataAreaRepository;
import com.cooksys.conversions.repository.SpringDataLocationRepository;
import com.cooksys.conversions.repository.SpringDataUserRepository;

@Service
public class AreaService {

	@Autowired
	SpringDataAreaRepository areaRepo;

	@Autowired
	SpringDataUserRepository userRepo;

	@Autowired
	SpringDataLocationRepository locationRepo;

	public Area createArea(long areaVal) {
		Area area = new Area(areaVal);
		areaRepo.save(area);
		return area;
	}

	public boolean login(User user) {
		return userRepo.findByUsername(user.getUsername()) != null ? true : false;
	}

	public Area areaHit(LocationHit hit) {
		Area area = areaRepo.findByAreaVal(hit.getArea());
		return area != null ? area : null;
	}

	public User newUser(User user) {
		User newUser = userRepo.findByUsername(user.getUsername()) != null ? user : null;

		if (newUser != null) {
			userRepo.save(newUser);
		}

		return newUser;
	}

	public long getHitCount(long areaVal) {
		return areaRepo.findByAreaVal(areaVal).getHits();
	}

	public List<Area> allAreas() {
		return areaRepo.findAll();
	}

	public List<User> getAreaUsers(long areaVal) {
		return userRepo.findAllByArea(areaRepo.findByAreaVal(areaVal));
	}

	public double getConversion(long areaVal) {
		double rate = (areaRepo.findByAreaVal(areaVal).getConversions()) / (areaRepo.findByAreaVal(areaVal).getHits());

		return areaRepo.findByAreaVal(areaVal).getHits() == 0 ? rate : 0;
	}

}
