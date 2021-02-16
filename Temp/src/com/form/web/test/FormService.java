package com.form.web.test;

import java.util.Date;

public class FormService {

	int seq;
	String id;
	String name;
	String email;
	String hp;
	Date regDate;
	String flag;
	
	
	public FormService(int seq, String id, String name, String email, String hp ,Date regDate,String flag) {
	
		this.seq= seq;
		this.id = id;
		this.name = name;
		this.email =email;
		this.hp =hp;
		this.regDate = regDate;
		this.flag =flag;
	}

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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}
