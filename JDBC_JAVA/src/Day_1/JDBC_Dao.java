package Day_1;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Dao {

	void view_document(int num) {
		ConnectionPool cp = new ConnectionPool();

		String sql = "select*" + "from notice where id =" + num;

		try {
			Statement st = cp.con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			rs.next();
			String title = rs.getString("title");
			String writer_id = rs.getString("writer_id");
			String content = rs.getString("content");
			String str_date = rs.getString("regdate");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("�����Ͻ� �� ��ȣ�� ������ : " + num);
			System.out.println("���� :" + title);
			System.out.println("�۾��� :" + writer_id);
			System.out.println("���� :" + content);
			System.out.println(
					"�ð� :" + str_date.substring(0, 4) + "��" + str_date.substring(5, 7) + "��" + str_date.substring(8, 9)
							+ "��" + str_date.substring(11, 13) + "��" + str_date.substring(14, 16) + "��");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void reading_document() {
		ConnectionPool cp = new ConnectionPool();
		String sql = "select*" + "from notice";

		try {

			Statement st = cp.con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				String title = rs.getString("title");
				String writer_id = rs.getString("writer_id");
				String content = rs.getString("content");
				String str_date = rs.getString("regdate");
				int number = rs.getInt("id");

				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("�۹�ȣ :" + number);
				System.out.println("���� :" + title);
				System.out.println("�۾��� :" + writer_id);
				System.out.println("���� :" + content);
				System.out.println("�ð� :" + str_date.substring(0, 4) + "��" + str_date.substring(5, 7) + "��"
						+ str_date.substring(8, 9) + "��" + str_date.substring(11, 13) + "��" + str_date.substring(14, 16)
						+ "��");
			}
			System.out.println("��簪�� ��µǾ����ϴ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void write_document() {
		ConnectionPool cp = new ConnectionPool();

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		String title_main = sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���");
		String writer = sc.nextLine();
		System.out.println("������ ���ּ���");
		String content = sc.nextLine();
		System.out.println("���� ÷���Ͻðڽ��ϱ�");
		String files = sc.nextLine();
		String sql = "INSERT INTO NOTICE(" + "TITLE," + "WRITER_ID," + "CONTENT," + "FILES" + ")" + "VALUES(?,?,?,?)";

		try

		{
//		Statement st = con.createStatement();
//		int result = st.executeUpdate(sql);

			PreparedStatement psmt = cp.con.prepareStatement(sql);

			psmt.setString(1, title_main);
			psmt.setString(2, writer);
			psmt.setString(3, content);
			psmt.setString(4, files);

			int result = psmt.executeUpdate();

			if (result == 1) {
				System.out.println("���������� �ԷµǾ����ϴ�");
			} else {
				System.out.println("�Է¿� �����Ͽ����ϴ�");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
