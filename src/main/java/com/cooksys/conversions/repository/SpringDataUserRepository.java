package com.cooksys.conversions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.conversions.entity.Area;
import com.cooksys.conversions.entity.User;

public interface SpringDataUserRepository extends JpaRepository<User, Long> {

	// finds user by username
	// **Login, RegeisterUser**
	public User findByUsername(String username);

	public List<User> findAllByArea(Area area);
}
