package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class UserDao {

	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;

	public UserDao() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/study?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String dbID = "root";
			String dbPass = "wjdrofl1!@";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, dbID, dbPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int login(String userID, String userPASS) { // login
		String SQL = "SELECT userPass FROM USER WHERE userID = ? ";

		try {
			pstm = con.prepareStatement(SQL);
			pstm.setString(1, userID);

			rs = pstm.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userPASS)) {
					return 1; // �� �ҷ����� ���� �α��μ���
				} else {
					return 0; // ������ ��й�ȣ Ʋ��
				}
			}
			return -1; // ���ӿ���
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // �����ͺ��̽�����
	}

	public int join(User user) {
		String SQL = "INSERT INTO USER VALUES(?,?,?,?,?)";
		try {
			pstm = con.prepareStatement(SQL);
			pstm.setString(1, user.getUserID());
			pstm.setString(2, user.getUserPASS());
			pstm.setString(3, user.getUserName());
			pstm.setString(4, user.getUserGender());
			pstm.setString(5, user.getUserEmail());
			return pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}return -1;
	}
}