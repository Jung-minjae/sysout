package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Service {

	private String URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "root";
	private String PW = "wjdrofl1!@";
	private String driver = "com.mysql.jdbc.Driver";
	
	public List<User> getUserList(int page, String query) {
		
		int start = 1 + (page - 1) * 10 ;
		int end = page * 10;
		String sql = "Select * from (Select @rownum:=@rownum+1 as num , n.* "
				+ "from(select l.LOCNAME as LOCATION, s.regdate as REGDATE, u.NAME as NAME, s.ENEMY as ENEMY, s.CONTENT as CONTENT, u.ID as ID, s.seq as seq "
				+ "from(select ID, LOCNAME from LOCATION)l, (select ID, NAME from USER)u, "
				+ "(select LOCID, ENEMY, REGDATE, HITER, CONTENT, seq from SCORE where LOCID " + query + ")s "
				+ "where u.ID = s.HITER and s.LOCID = l.ID order by seq desc)n "
				+ "Where (@rownum:=0)=0) num Where num.num between ? and ?";
		
		List<User> list = new ArrayList<User>();
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(URL, root, PW);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, start);
			psmt.setInt(2, end);
			ResultSet rs = psmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("ID");
				String location = rs.getString("LOCATION");
				Date date = rs.getDate("REGDATE");
				String name = rs.getString("NAME");
				String enemy = rs.getString("ENEMY");
				String content = rs.getString("CONTENT");
				int seq = rs.getInt("seq");
				
				User user = new User(id, location, date, name, enemy, content, seq);
				list.add(user);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public User getUser(String name) {
		
		String sql = "select * from user where id = ?";
		System.out.println(sql);
		User user = null;
		System.out.println("ss : " + name);

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(URL, root, PW);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			ResultSet rs = psmt.executeQuery();
			System.out.println(sql);
			
			while (rs.next()) {
				String id = rs.getString("ID");
				name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				user = new User(id, name, email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public int getCount(String query) {

		int count = 0;
		String sql = "Select count(num.id) as count from(Select @rownum:=@rownum+1 as num , n.* "
				+ "from(select l.LOCNAME as LOCATION, s.regdate as REGDATE, u.NAME as NAME, s.ENEMY as ENEMY, s.CONTENT as CONTENT, u.ID as ID "
				+ "from(select ID, LOCNAME from LOCATION)l, (select ID, NAME from USER)u, "
				+ "(select LOCID, ENEMY, REGDATE, HITER, CONTENT from SCORE where LOCID " + query + ")s "
				+ "where u.ID = s.HITER and s.LOCID = l.ID order by regdate desc)n "
				+ "Where (@rownum:=0)=0) num";
		
		List<User> list = new ArrayList<User>();
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(URL, root, PW);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if(rs.next()) {
				count = rs.getInt("count");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public int removeNoticeAll(int[] ids) {
		String sql = "delete from score where seq=?";
		int result = 0;
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(URL, root, PW);
			
			for(int i = 0; i <ids.length; i++) {
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setInt(1, ids[i]);
				psmt.executeUpdate();
				result++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
