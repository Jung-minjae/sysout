package Day_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Practice {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/JDBC?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "wjdrofl1!@";

		String sql = "select * from notice";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pw);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				String title = rs.getString("title");
				String writer_id = rs.getString("writer_id");
				String content = rs.getString("content");
				String str_date = rs.getString("regdate");
				String number = rs.getString("id");
				
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("�۹�ȣ :"+number);
				System.out.println("���� :" + title);
				System.out.println("�۾��� :" + writer_id);
				System.out.println("���� :"+content);
				System.out.println("�ð� :"+str_date.substring(0,4)+"��"+str_date.substring(5,7)+"��"+str_date.substring(8,9)+"��"+str_date.substring(11,13)+"��"+str_date.substring(14,16)+"��" );
			}
			System.out.println("��簪�� ��µǾ����ϴ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
