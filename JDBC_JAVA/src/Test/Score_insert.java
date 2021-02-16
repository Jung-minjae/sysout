package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Score_insert {

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

				System.out.println("Locid 를 입력해주세요");
				String Locid = sc.next();
				System.out.println("적 이름을 입력해주세요");
				String Enemy = sc.next();
				System.out.println("Hiter  입력해주세요");
				String Hiter = sc.next();
				System.out.println("Content 입력해주세요");
				String Content = sc.next();
				System.out.println("메모하실것이 있으면 입력해주세요");
				String memo = sc.next();
				String sql = "insert into score("
						+"Locid, "+ "Enemy, " + " Hiter, " + " Content," + "memo  " + ") values(?, ?, ?, ?, ?)";

				try {

				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);

				
					PreparedStatement psmt = con.prepareStatement(sql);// prepared 사용하면 갈호에 쿼리 바로 넣는다
					psmt.setString(1, Locid);
					psmt.setString(2, Enemy);
					psmt.setString(3, Hiter);
					psmt.setString(4, Content);
					psmt.setString(5, memo);
					

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