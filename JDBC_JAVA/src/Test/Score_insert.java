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
			System.out.println("1. �Է� 2. ������");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:

				System.out.println("Locid �� �Է����ּ���");
				String Locid = sc.next();
				System.out.println("�� �̸��� �Է����ּ���");
				String Enemy = sc.next();
				System.out.println("Hiter  �Է����ּ���");
				String Hiter = sc.next();
				System.out.println("Content �Է����ּ���");
				String Content = sc.next();
				System.out.println("�޸��Ͻǰ��� ������ �Է����ּ���");
				String memo = sc.next();
				String sql = "insert into score("
						+"Locid, "+ "Enemy, " + " Hiter, " + " Content," + "memo  " + ") values(?, ?, ?, ?, ?)";

				try {

				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);

				
					PreparedStatement psmt = con.prepareStatement(sql);// prepared ����ϸ� ��ȣ�� ���� �ٷ� �ִ´�
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