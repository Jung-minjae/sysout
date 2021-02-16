package com.jdbc.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdbc.app.entity.Notice;

public class NoticeService {
	private	String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private	String root = "root";
	private	String pw = "wjdrofl1!@";
	private String driver ="com.mysql.jdbc.Driver";
	public List<Notice> getList(int page) {

		int start = 1+(page-1)*10; // 1 , 11 ,21 ,31 ,41 ,51
		int end = page*10;  // 10 20 30 40 50
		

		String sql = "Select *"
				 + "from (Select @rownum:=@rownum+1 as num , n.*"
				 + "        from(select *"
				 + "               From notice"
				 + "		      order by regdate desc)n"
				 + "        Where (@rownum:=0)=0) num "
				 + "Where num.num between ? and ? ";
		List<Notice> list = new ArrayList<Notice>();
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1,start);
			psmt.setInt(2, end);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String writer_id = rs.getString("writer_id");
				Date regdate = rs.getDate("regdate");
				String content = rs.getString("content");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");

				Notice nt = new Notice(id, title, writer_id, content, regdate, hit, files);
				list.add(nt);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	public int insert(Notice nt) {
	
	String title = nt.getTitle();
	String writer_id =nt.getWriter_id();
	String content = nt.getContent();
	String files = nt.getFiles();
	int result = 0;
	
	String sql = "INSERT INTO NOTICE(" + "TITLE," + "WRITER_ID," + "CONTENT," + "FILES" + ")" + "VALUES(?,?,?,?)";
	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, root, pw);
		 PreparedStatement psmt = con.prepareStatement(sql);
		 psmt.setString(1, title);
		 psmt.setString(2, writer_id);
		 psmt.setString(3, content);
		 psmt.setString(4, files);
		


		result = psmt.executeUpdate();

		System.out.println(result);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}return 0;	
	
	}

	public int update(Notice nt) {
		

		String title = nt.getTitle();
		String content = nt.getContent();
		String files = nt.getFiles();
		int id = nt.getId();
		int result = 0;

		String sql = "update notice" + " set " + "title = ?," + "content =  ?," + "files= ? " + "where id= ?";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, content);
			psmt.setString(3, files);
			psmt.setInt(4, id);

			result = psmt.executeUpdate();

			System.out.println(result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return result;
	}
	public int delete(int id) {

	 int result = 0;
		String sql = "delete from notice where id= 9";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
			 PreparedStatement psmt = con.prepareStatement(sql);
			 psmt.setInt(1, id);


			result = psmt.executeUpdate();

			System.out.println(result);

		} catch (Exception e) {
			
			e.printStackTrace();
		
	}return  result;
}
	public int getCount() {
        int count = 0;
        String sql = "select count(id)as count from notice";
        try {
                 Class.forName(driver);
                 Connection con = DriverManager.getConnection(url, root, pw);
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(sql);

                 if(rs.next()) {
                    count = rs.getInt("count");
                    System.out.println(count);
                 }

              } catch (Exception e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
              }
        return count;
     }
}

