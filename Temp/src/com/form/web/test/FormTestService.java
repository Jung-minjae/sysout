package com.form.web.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class FormTestService {

	private String url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "root";
	private String pw = "wjdrofl1!@";
	private String driver = "com.mysql.jdbc.Driver";

	public FormService getUser(String name) {
		String sql = "Select * from user where name=?";

		FormService fs = null;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int seq = rs.getInt("seq");
				String id = rs.getString("id");
				 name = rs.getString("name");
				String email = rs.getString("email");
				String hp = rs.getString("hp");
				Date date = rs.getDate("regdate");
				String flag = rs.getString("flag");

				 fs = new FormService(seq, id, name, email, hp, date, flag);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return fs;
	}
}
