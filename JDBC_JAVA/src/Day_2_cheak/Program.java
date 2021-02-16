package Day_2_cheak;



import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) { 
		String url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "wjdrofl1!@";

		String sql = "select *  from location";
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