package Day_2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program3 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "wjdrofl1!@";

		String title = "update title";

		String content = "test ���Դϴ�.";
		String files = " ";
		int id_1 = 9;

		String sql = "delete from notice where id= 9";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pw);
			 PreparedStatement psmt = con.prepareStatement(sql);
			 psmt.setInt(1, id_1);


			int result = psmt.executeUpdate();

			System.out.println(result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}

//insert into notice values(1, 'jdbc ����', '������' , '�� ������ô�.', sysdate(), 0, '');

//while ���� ������ if(hit>10)  x  select *  from notice where hit>10 o
//show table status where name = 'notice';
//alter table notice auto_increment=1; �ʱ�//
//alter table notice modify id int not null auto_increment;