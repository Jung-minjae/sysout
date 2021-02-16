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
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택하신 글 번호의 정보는 : " + num);
			System.out.println("제목 :" + title);
			System.out.println("글쓴이 :" + writer_id);
			System.out.println("내용 :" + content);
			System.out.println(
					"시간 :" + str_date.substring(0, 4) + "년" + str_date.substring(5, 7) + "월" + str_date.substring(8, 9)
							+ "일" + str_date.substring(11, 13) + "시" + str_date.substring(14, 16) + "분");

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

				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("글번호 :" + number);
				System.out.println("제목 :" + title);
				System.out.println("글쓴이 :" + writer_id);
				System.out.println("내용 :" + content);
				System.out.println("시간 :" + str_date.substring(0, 4) + "년" + str_date.substring(5, 7) + "월"
						+ str_date.substring(8, 9) + "일" + str_date.substring(11, 13) + "시" + str_date.substring(14, 16)
						+ "분");
			}
			System.out.println("모든값이 출력되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void write_document() {
		ConnectionPool cp = new ConnectionPool();

		Scanner sc = new Scanner(System.in);

		System.out.println("제목을 입력하세요");
		String title_main = sc.nextLine();
		System.out.println("이름을 입력하세요");
		String writer = sc.nextLine();
		System.out.println("내용을 써주세요");
		String content = sc.nextLine();
		System.out.println("파일 첨부하시겠습니까");
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
				System.out.println("정상적으로 입력되었습니다");
			} else {
				System.out.println("입력에 실패하였습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
