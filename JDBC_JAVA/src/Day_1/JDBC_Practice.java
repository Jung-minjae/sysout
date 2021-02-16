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
				
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("글번호 :"+number);
				System.out.println("제목 :" + title);
				System.out.println("글쓴이 :" + writer_id);
				System.out.println("내용 :"+content);
				System.out.println("시간 :"+str_date.substring(0,4)+"년"+str_date.substring(5,7)+"월"+str_date.substring(8,9)+"일"+str_date.substring(11,13)+"시"+str_date.substring(14,16)+"분" );
			}
			System.out.println("모든값이 출력되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
