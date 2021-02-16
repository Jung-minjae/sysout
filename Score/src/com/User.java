package com;

import java.util.Date;

public class User {
	int seq;
	String location;
	Date date;
	String name;
	String enemy;
	String content;
	String id;
	int userid;
	String locname;
	String maker;
	String flag;
	String locname1;
	int locid;
	String memo;

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public User(int seq, String location, Date date, String name, String enemy, String content, String id, int userid,
			String locname, String maker, String flag, String locname1, int locid, String memo) {
		
		this.seq = seq;
		this.location = location;
		this.date = date;
		this.name = name;
		this.enemy = enemy;
		this.content = content;
		this.id = id;
		this.userid = userid;
		this.locname = locname;
		this.maker = maker;
		this.flag = flag;
		this.locname1 = locname1;
		this.locid = locid;
		this.memo =memo;
	}

	public User() {

	}

	public User(String id, String location, Date date, String name, String enemy, String content, String maker,
			int seq) {
		this.id = id;
		this.location = location;
		this.date = date;
		this.name = name;
		this.enemy = enemy;
		this.content = content;
		this.maker = maker;
		this.seq = seq;

	}

	public User(int userid, String locname1, String maker, String flag) {
		this.userid = userid;
		this.locname1 = locname1;
		this.maker = maker;
		this.flag = flag;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getLocname() {
		return locname;
	}

	public void setLocname(String locname) {
		this.locname = locname;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getLocname1() {
		return locname1;
	}

	public void setLocname1(String locname1) {
		this.locname1 = locname1;
	}

	public int getLocid() {
		return locid;
	}

	public void setLocid(int locid) {
		this.locid = locid;
	}

}