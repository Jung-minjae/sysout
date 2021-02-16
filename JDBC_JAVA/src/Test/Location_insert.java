package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Location_insert {

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

				System.out.println("지역번호 를 입력해주세요");
				int id = sc.nextInt();
				System.out.println("지역이름 을 입력해주세요");
				String locName = sc.next();
				System.out.println("Maker 를 입력해주세요");
				String Maker = sc.next();
				System.out.println("Y/N 입력해주세요");
				String Flag = sc.next();
				String sql = "insert into location("
						+"id, "+ "locName, " + " maker, "+ " Flag " + ") values(?, ?, ?, ?)";

				try {

					System.out.println(sql);
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);

					// Statement st = con.createStatement();
					// result rs = psmt.executeUpdate(sql);
					PreparedStatement psmt = con.prepareStatement(sql);// prepared 사용하면 갈호에 쿼리 바로 넣는다
					psmt.setInt(1, id);
					psmt.setString(2, locName);
					psmt.setString(3, Maker);
					psmt.setString(4, Flag);
					

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