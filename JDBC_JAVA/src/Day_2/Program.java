package Day_2;



import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) { 
		String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "wjdrofl1!@";

		String sql = "select *  from notice";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pw);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				int ID = rs.getInt("id");				
				String title = rs.getString("title");
				String writerid = rs.getString("writer_id");
				Date regDate = rs.getDate("regdate");
				String content = rs.getString("content");
				int hit = rs.getInt("hit");
			
				System.out.println(title);								
			}
			
		
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
			
		}

	}

}

//insert into notice values(1, 'jdbc 배우기', '이현수' , '잘 배워봅시다.', sysdate(), 0, '');

//while 문을 가지고 if(hit>10)  x  select *  from notice where hit>10 o
//show table status where name = 'notice';
//alter table notice auto_increment=1; 초기//
//alter table notice modify id int not null auto_increment;