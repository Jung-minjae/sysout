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
			System.out.println("1. �Է� 2. ������");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:

				System.out.println("������ȣ �� �Է����ּ���");
				int id = sc.nextInt();
				System.out.println("�����̸� �� �Է����ּ���");
				String locName = sc.next();
				System.out.println("Maker �� �Է����ּ���");
				String Maker = sc.next();
				System.out.println("Y/N �Է����ּ���");
				String Flag = sc.next();
				String sql = "insert into location("
						+"id, "+ "locName, " + " maker, "+ " Flag " + ") values(?, ?, ?, ?)";

				try {

					System.out.println(sql);
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);

					// Statement st = con.createStatement();
					// result rs = psmt.executeUpdate(sql);
					PreparedStatement psmt = con.prepareStatement(sql);// prepared ����ϸ� ��ȣ�� ���� �ٷ� �ִ´�
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