package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class User_insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "wjdrofl1!@";
		Boolean run = true;
		while (run) {
			System.out.println("1. 입력 2. 끝내기");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:

				System.out.println("id 를 입력해주세요");
				String id = sc.next();
				System.out.println("비밀번호을 입력해주세요");
				String Pass = sc.next();
				System.out.println("이름을  입력해주세요");
				String name = sc.next();
				System.out.println("email 입력해주세요");
				String email = sc.next();
				System.out.println("Flag Y/N 설정해주세요");
				String Flag = sc.next();
				String sql = "insert into user("
						+"id, "+ "Pass, " + " name, " + " email," + "Flag  " + ") values(?, ?, ?, ?, ?)";

				try {

				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);

				
					PreparedStatement psmt = con.prepareStatement(sql);// prepared 사용하면 갈호에 쿼리 바로 넣는다
					psmt.setString(1, id);
					psmt.setString(2, Pass);
					psmt.setString(3, name);
					psmt.setString(4, email);
					psmt.setString(5, Flag);
					

					int result = psmt.executeUpdate();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
				break;
			case 2:
				run = false;
				break;

			}
		}
	}
}