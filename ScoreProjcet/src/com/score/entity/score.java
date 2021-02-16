package com.score.entity;

import java.util.Date;

public class score {
	private String location;
	private String name;
	private Date date;
	private String enemy;
	
	public score(String location, String name, Date date, String enemy) {
		
		this.location = location;
		this.name = name;
		this.date = date;
		this.enemy = enemy;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEnemy() {
		return enemy;
	}
	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}
}
