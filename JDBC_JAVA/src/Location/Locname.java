package Location;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Locname {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "wjdrofl1!@";
		Boolean run = true;
		while (run) {

			int choice = sc.nextInt();
			switch (choice) {

			case 1:

				System.out.println("���� �̸��� �Է����ּ���");
				String locName = sc.next();
				System.out.println("Y/N �Է����ּ���");
				String Flag = sc.next();

				String sql = "insert into location(" // ���� ������
						+ "locName, " + " Flag " + ") values(?, ?)";

				try {

					System.out.println(sql);
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);

					// Statement st = con.createStatement();
					// result rs = psmt.executeUpdate(sql);
					PreparedStatement psmt = con.prepareStatement(sql);// prepared ����ϸ� ��ȣ�� ���� �ٷ� �ִ´�

					psmt.setString(1, locName);
					psmt.setString(2, Flag);

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