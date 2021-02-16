package com;

import java.util.Date;

public class User {

	String location;
	Date date;
	String name;
	String enemy;
	String content;
	String email;
	String id;
	int seq;

	public User(String id, String location, Date date, String name, String enemy, String content, int seq) {
		this.id = id;
		this.location = location;
		this.date = date;
		this.name = name;
		this.enemy = enemy;
		this.content = content;
		this.seq = seq;
	}
	
	public User(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnemy() {
		return enemy;
	}
	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
