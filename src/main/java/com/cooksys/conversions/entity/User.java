package com.cooksys.conversions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@ManyToOne
	@JoinColumn
	private Area area;

	public User() {
	}

	public User(String username, String password, long areaVal) {
		this.username = username;
		this.password = password;
		this.area = new Area(areaVal);
	}

	public User(String username, String password, Area area) {
		this.username = username;
		this.password = password;
		this.area = area;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}
