package Homework_Day_1_weather;

import java.sql.Connection;
import java.sql.DriverManager;

public class Weather_Pool {
	final String url;
	final String id;
	final String pw;
	Connection con;
	String date;
	int temp;
	public Weather_Pool() {
		 url = "jdbc:mysql://localhost:3306/Home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
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