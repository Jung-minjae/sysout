package Day_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class membership {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "wjdrofl1!@";

		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("이름을 입력하세요");

		String name = sc.nextLine();
		System.out.println("e-mail을 입력하세요");
		String email = sc.nextLine();
		System.out.println("핸드폰 번호를 입력하세요");
		String hp = sc.nextLine();

//		String sql = "insert into user (id, name, email, hp, flag ) values(?, ?, ?, ?, ?)";
		String sql = "insert into USER (seq,"
	               + "id,"
	               + "name,"
	               + "email,"
	               + "hp,"
	               + "flag)"
	               + "values ((select c.count"
	               + " from (select max(seq)+1 as count"
	               + " from user)c),"
	               + "?,"
	               + "?,"
	               + "?,"
	               + "?,"
	               + "'Y')";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
			System.out.println("111111111111");
			PreparedStatement psmt = con.prepareStatement(sql);
			System.out.println("2222222222");

			psmt.setString(1, id);
			psmt.setString(2, name);
			psmt.setString(3, email);
			psmt.setString(4, hp);
			System.out.println("333333333333333");
			int result = psmt.executeUpdate();
			
			if (result == 1) {
				System.out.println("정상적으로 입력 되었습니다.");
			} else {
				System.out.println("입력되지 못했습니다.");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}