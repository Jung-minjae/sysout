package contents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ContentsDao {
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;

	String str = "abc";

	public ContentsDao() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/study?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String dbID = "root";
			String dbPass = "wjdrofl1!@";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, dbID, dbPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDate() {
		String SQL = "SELECT NOW()";
		try {
			psmt = con.prepareStatement(SQL);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ""; // DB 오류
	}

	public int getNext() {
		String SQL = "select contentID from contents order by contentID desc";
		try {
			psmt = con.prepareStatement(SQL);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1; // 글이 하나도 없으면 1번

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // DB 오류
	}

	public int write(String Title, String userID, String Content) {
		String SQL = "INSERT INtO CONTENTS VALUES (?,?,?,?,?,?)";
		System.out.println(Title);
		try {
			PreparedStatement psmt = con.prepareStatement(SQL);
			psmt.setInt(1, getNext());
			psmt.setString(2, Title);
			psmt.setString(3, userID);
			psmt.setString(4, getDate());
			psmt.setString(5, Content);
			psmt.setInt(6, 1);
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; // 데이터베이스 오류
	}

	public ArrayList<Contents> getList(int pageNumber) {
		String SQL = "select *from contents where contentID < ? and Available =1 order by contentID desc limit 10";
		ArrayList<Contents> list = new ArrayList<Contents>();
		try {
			PreparedStatement psmt = con.prepareStatement(SQL);

			psmt.setInt(1, getNext() - (pageNumber - 1) * 10);
			rs = psmt.executeQuery();

			while (rs.next()) {
				Contents ct = new Contents();
				ct.setContentID(rs.getInt(1));
				ct.setTitle(rs.getString(2));
				ct.setUserID(rs.getString(3));
				ct.setDate(rs.getString(4));
				ct.setContent(rs.getString(5));
				ct.setAvailable(rs.getInt(6));
				list.add(ct);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// 페이징 처리
	public boolean nextPage(int pageNumber) {
		String SQL = "select *from contents where contentID < ? and Available =1 ";

		try {
//			System.out.println("GET NEXT : "+getNext()+"!!!!!!!!");
			PreparedStatement psmt = con.prepareStatement(SQL);
			psmt.setInt(1, getNext() - (pageNumber - 1) * 10);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// 글보기
	public Contents getContents(int contentID) {
		String SQL = "select *from contents where contentID =?";

		try {
//			System.out.println("GET NEXT : "+getNext()+"!!!!!!!!");
			PreparedStatement psmt = con.prepareStatement(SQL);
			psmt.setInt(1, contentID);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Contents ct = new Contents();
				ct.setContentID(rs.getInt(1));
				ct.setTitle(rs.getString(2));
				ct.setUserID(rs.getString(3));
				ct.setDate(rs.getString(4));
				ct.setContent(rs.getString(5));
				ct.setAvailable(rs.getInt(6));
				return ct;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; // 오류
	}

	public int update(int ContentID, String Title, String Content) { //글등록문
		String SQL = "UPDATE CONTENTS SET Title =?, Content =? where ContentID=?";
		try {
			PreparedStatement psmt = con.prepareStatement(SQL);
			psmt.setString(1, Title);
			psmt.setString(2, Content);
			psmt.setInt(3, ContentID);
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;

	}

	public int delete(int ContentID) { //글삭제문
		String SQL = "UPDATE CONTENTS SET Available =0 where ContentID=?";
		try {
			PreparedStatement psmt = con.prepareStatement(SQL);

			psmt.setInt(1, ContentID);
			return psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;

	}
	
	
}