package com.home_work.app.entity;

public class WeatherBeans {		//temp table
		private String date; 		//날짜
		private int temp;		//온도
		private int LOCID;		//LOCID
		private String writer; 	//글쓴이
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
		public int getLOCID() {
			return LOCID;
		}
		public void setLOCID(int lOCID) {
			LOCID = lOCID;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
}