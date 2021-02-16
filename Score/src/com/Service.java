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

   private String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   private String root = "root";
   private String pw = "wjdrofl1!@";
   private String driver = "com.mysql.jdbc.Driver";
   
   public List<User> getUserList(int page, String query) {
      
	      int start = 1 + (page - 1) * 10 ;
	      int end = page * 10;
	      String sql = "Select * from (Select @rownum:=@rownum+1 as num , n.* "
	            + "from(select l.LOCNAME as LOCATION, s.regdate as REGDATE, u.NAME as NAME, s.ENEMY as ENEMY, s.CONTENT as CONTENT, u.id as id, l.MAKER as MAKER, s.seq as seq "
	            + "from(select ID, LOCNAME, MAKER from LOCATION)l, (select id, NAME from USER)u, "
	            + "(select LOCID, ENEMY, REGDATE, HITER, CONTENT, seq from SCORE where LOCID " + query + ")s "
	            + "where u.id = s.HITER and s.LOCID = l.ID order by seq desc)n "
	            + "Where (@rownum:=0)=0) num Where num.num between ? and ?";
	     
			List<User> list = new ArrayList<User>();

			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, root, pw);
				PreparedStatement psmt = con.prepareStatement(sql);

				psmt.setInt(1, start);
				psmt.setInt(2, end);
				ResultSet rs = psmt.executeQuery();

				while (rs.next()) {
					String id = rs.getString("id");
					String location = rs.getString("LOCATION");
					Date date = rs.getDate("REGDATE");
					String name = rs.getString("NAME");
					String enemy = rs.getString("ENEMY");
					String content = rs.getString("CONTENT");
					String maker = rs.getString("maker");
					int seq = rs.getInt("seq");

					User user = new User(id, location, date, name, enemy, content, maker, seq);
					list.add(user);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}

	public User getlocationlist(String locname) {
		
		String sql = "select * from location where maker = '" + locname + "'";

		User user = null;
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root,pw);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			System.out.println(sql);

			while (rs.next()) {

				int userid = rs.getInt("id");
				String locname1 = rs.getString("locname");
				String maker = rs.getString("maker");
				String flag = rs.getString("flag");
			
				user = new User(userid, locname1, maker, flag);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public int getCount(String query) {
		
		int count = 0;
		
		String sql = "Select count(num.id) as count from(Select @rownum:=@rownum+1 as num , n.* "
	            + "from(select l.LOCNAME as LOCATION, s.regdate as REGDATE, u.NAME as NAME, s.ENEMY as ENEMY, s.CONTENT as CONTENT, u.id as id, l.MAKER as MAKER, s.seq as seq "
	            + "from(select ID, LOCNAME, MAKER from LOCATION)l, (select id, NAME from USER)u, "
	            + "(select LOCID, ENEMY, REGDATE, HITER, CONTENT, seq from SCORE where LOCID " + query + ")s "
	            + "where u.id = s.HITER and s.LOCID = l.ID order by seq desc)n "
	            + "Where (@rownum:=0)=0) num";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				count = rs.getInt("count");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public int removeNoticeAll(int[] ids) { // 리스트에서체크해서삭제
		String sql = "delete from score where seq =?";
		int result = 0;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			
			for (int i = 0; i < ids.length; i++) {
				int id = ids[i];
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setInt(1, id);
				result = psmt.executeUpdate();
				result++;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return result;
	}
	public int inserttest(User ur) {    //글 쓰기
		int result =0;
		String sql = "insert into score (Locid,Enemy,Hiter,content,MEMO) "
				+ " values (?,?,?,?,?)";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt =con.prepareStatement(sql);
			psmt.setInt(1, ur.getLocid());
			psmt.setString(2, ur.getEnemy());
			psmt.setString(3, ur.getId());
			psmt.setString(4, ur.getContent());
			psmt.setString(5, ur.getMemo());

		    psmt.executeUpdate();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
			
		return result;
	}

	public int deleteNoticeAll(int[] ids) {
		int result =0;
		String params="";
		
		for(int i=0; i<ids.length;i++) {
			params += ids[i];
			if(i<ids.length-1)
				params +=",";
			
		}
		String sql = "delete from score where seq in("+params+")";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			Statement st =con.createStatement();
			st.executeUpdate(sql);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
			
		return result;
	
		
	}
}