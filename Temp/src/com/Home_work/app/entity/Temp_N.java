package com.Home_work.app.entity;

public class Temp_N {
	String date;
	int temp;
	int locID;
	String writer;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getLocID() {
		return locID;
	}

	public void setLocID(int locID) {
		this.locID = locID;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Temp_N(String date, int temp ,int locID, String writer) {
		this.date = date;
		this.temp = temp;
		this.locID = locID;
		this.writer= writer;
	}
}
