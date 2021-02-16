package com.jdbc.app.entity;

import java.util.Date;

public class Notice {
	int id;
	String title;
	String writer_id;
	String content;
	Date regdate;
	int hit;
	String files;

	// 생성자
	public Notice() {
	}

	// 생성자 오버라이드

	public int getId() {
		return id;
	}

	public Notice(int id, String title, String writer_id, String content, Date regdate, int hit, String files) {
		this.id = id;
		this.title = title;
		this.writer_id = writer_id;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
		this.files = files;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter_id() {
		return writer_id;
	}

	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

}
