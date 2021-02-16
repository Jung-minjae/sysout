package Day_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPool {
	final String url;
	final String id;
	final String pw;
	Connection con;
	
	public ConnectionPool() {
		 url = "jdbc:mysql://localhost:3306/JDBC?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		 id = "root";
		 pw = "wjdrofl1!@";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 con = DriverManager.getConnection(url, id, pw);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}