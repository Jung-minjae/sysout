package Weather_Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class weather {

	final String url;
	final String id;
	final String pw;
	Connection con;
	String date;
	int temp;

	public weather() {
		url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
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