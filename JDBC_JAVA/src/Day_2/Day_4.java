package Day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Day_4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "wjdrofl1!@";
		Scanner sc = new Scanner(System.in);

		System.out.println("�����̸��� �Է����ּ���");
		String location = sc.nextLine();
		String locsql = "select id from location where locname = ?";
		int id = 0;

//			String sql = "update notice" 
//					+ " set " 
//					+ "title = ?," 
//					+ "content =  ?," 
//					+"files= ? "+ "where id= ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(locsql);
			psmt.setString(1, location);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id");

			}
			
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("��¥�� �Է����ּ��� . ex)YYYYMMDD");
		String date = sc.nextLine();
		System.out.println("�µ��� �Է����ּ��� ex)-40 ~ 40");
		int temp = sc.nextInt();
		sc.nextLine();
		System.out.println(temp);
			
			
		String sql = "insert into temp (date, temp, locid) values(?, ?, ?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);

			psmt.setString(1, date);
			psmt.setInt(2, temp);
			psmt.setInt(3, id);
			
			int result = psmt.executeUpdate();
			if (result == 1) {
				System.out.println("���������� �Է� �Ǿ����ϴ�.");
			} else {
				System.out.println("�Էµ��� ���߽��ϴ�.");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
