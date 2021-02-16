package com.home_work.app.entity;

import java.util.Date;

public class LocationBeans {		//location table
	private int ID;	//ID
	private String LOCNAME;	//지역명
	private Date regdate;	//YYYY-MM-DD 00:00:00 Format
	private String Flag;	//T OR F
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLOCNAME() {
		return LOCNAME;
	}
	public void setLOCNAME(String lOCNAME) {
		LOCNAME = lOCNAME;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getFlag() {
		return Flag;
	}
	public void setFlag(String flag) {
		Flag = flag;
	}
	
}
