package com.Temp.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Home_work.app.entity.Temp_N;

public class Temp_service {

	private String url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "root";
	private String pw = "wjdrofl1!@";
	private String driver = "com.mysql.jdbc.Driver";

	public List<Temp_N> getTempList(int page) {

		String sql = "select*from temp";

		List<Temp_N> list = new ArrayList<Temp_N>();
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				String Date = rs.getString("Date");
				int Temp = rs.getInt("Temp");
				int locID = rs.getInt("locID");
				String writer = rs.getString("writer");

				Temp_N nt = new Temp_N(Date, Temp, locID, writer);
				list.add(nt);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Temp_N gettempDetail(String date) {
		String sql = "Select * from temp where Date=?";
		Temp_N nt = null;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, date);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				date = rs.getString("Date");
				int Temp = rs.getInt("Temp");
				int locID = rs.getInt("locID");
				String writer = rs.getString("writer");
				nt = new Temp_N(date, Temp, locID, writer);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return nt;
	}
}
