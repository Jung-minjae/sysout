package com.jdbc.app.entity;

import java.util.Date;

public class NoticeComment {

	private int id;
	private int mid;
	private String writer_id;
	private Date regdate;
	private String comment;

	
	public NoticeComment() {
		
	}
	public NoticeComment(int id, int mid, String writer_id, Date regdate, String comment) {
		this.id = id;
		this.mid = mid;
		this.writer_id = writer_id;
		this.regdate = regdate;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getWriter_id() {
		return writer_id;
	}

	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
