package com.cooksys.conversions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.conversions.entity.Area;
import com.cooksys.conversions.entity.User;
import com.cooksys.conversions.pojo.LocationHit;
import com.cooksys.conversions.service.AreaService;

@RestController
@RequestMapping("conversion")
public class ConversionController {

	@Autowired
	AreaService areaService;

	@RequestMapping(value = "/newArea/{areaVal}", method = RequestMethod.POST)
	public Area getNewArea(@PathVariable("areaVal") long areaVal) {
		return areaService.createArea(areaVal);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public boolean isLoggedIn(@RequestBody User user) {
		return areaService.login(user);
	}

	@RequestMapping(value = "/incrementArea", method = RequestMethod.POST)
	public Area areaHit(@RequestBody LocationHit hit) {
		return areaService.areaHit(hit);
	}

	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return areaService.newUser(user);
	}

	/***************** GET Requests ********************/

	@RequestMapping(value = "/area/count/{areaVal}", method = RequestMethod.GET)
	public long getHits(@PathVariable("areaVal") long areaVal) {
		return areaService.getHitCount(areaVal);
	}

	@RequestMapping(value = "/area", method = RequestMethod.GET)
	public List<Area> getAll() {
		return areaService.allAreas();
	}

	@RequestMapping(value = "users/{areaVal}", method = RequestMethod.GET)
	public List<User> getUsers(@PathVariable("areaVal") long areaVal) {
		return areaService.getAreaUsers(areaVal);
	}

	@RequestMapping(value = "rate/{areaVal}", method = RequestMethod.GET)
	public double getRate(@PathVariable("areaVal") long areaVal) {
		return areaService.getConversion(areaVal);
	}

}
