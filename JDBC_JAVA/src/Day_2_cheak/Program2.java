package Day_2_cheak;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "wjdrofl1!@";

		String ID = "ID";
		String locName = "�λ�";
	
	

		String sql = "update location" 
				+ " set " 
				+" ID =?,"
				+ "locName = ?," 		
				+"Flag= = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pw);
			 PreparedStatement psmt = con.prepareStatement(sql);
			 psmt.setString(1, ID);
			 psmt.setString(2, locName);
			


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