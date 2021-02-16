package com.home_work.app.entity;

import java.util.Date;

public class UserBeans {		//user table
	private int seq;		//순번?
	private String id;		//ID
	private String name;		//이름(ex 김도윤)
	private String email;		//이메일
	private String hp;		//폰번호
	private Date regdate;	//YYYY-MM-DD 00:00:00 Format
	private String flag;	//T OR F
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
