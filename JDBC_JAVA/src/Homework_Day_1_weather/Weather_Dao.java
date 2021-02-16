package Homework_Day_1_weather;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Weather_Dao {
	Weather_Pool wp = new Weather_Pool();

	Connection con = wp.con;
	String date;
	int temp;
	int locid;
	String date2 = "202101";
	int sum;
	String writer;
	Random rdm = new Random();

	public void temp_record() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int i;
		while (run) {
			System.out.println("1.입력 2.그만하기");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("날짜를 입력해 주세요 (ex)202101 18");
				date = date2 + sc.next();

				System.out.println("온도를 입력해주세요");
				temp = (int) rdm.nextInt(30) + 1;
				System.out.println(temp);
				System.out.println("지역 고유번호를 입력해주세요");
				locid = 4;
				System.out.println();
				String sql = "INSERT INTO TEMP (" + "date," + "temp," + "locid" + ")values(?,?,?)";

				try

				{

					PreparedStatement psmt = con.prepareStatement(sql);
					psmt.setString(1, date);
					psmt.setInt(2, temp);
					psmt.setInt(3, locid);

					int result = psmt.executeUpdate();

					if (result == 1) {
						System.out.println("정상적으로 입력되었습니다");
					} else {
						System.out.println("입력에 실패하였습니다");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				run = false;
				break;
			}
		}
	}

	public void read() {

		try {
			String sql = "select * from temp";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) { // DB에 값이 있을때까지 반복
				temp = rs.getInt("temp");
				date = rs.getString("date");
				locid = rs.getInt("locid");
				System.out.println("지역 고유번호 :" + locid);
				System.out.println(
						"날짜: " + date.substring(0, 4) + "년" + date.substring(4, 6) + "월" + date.substring(6, 8) + "일");
				System.out.println("온도: " + temp);
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}

			System.out.println("모든 값이 출력되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void avg() {

		ArrayList<Integer> sum = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int hum = 0;

		System.out.println("지역 이름을 입력하세요");
		String local_name = sc.next();
		System.out.println("보고싶은 달을 입력하세요");
		String month = sc.next();

		String sql = " select loc.id, loc.locname, t.temp , t.date " + " from location loc, temp t "
				+ " where loc.id = t	.locID " + " and loc.locname =" + "'" + local_name + "'" + "";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				int id1 = rs.getInt("id");
				String locname1 = rs.getString("locname");
				String date = rs.getString("date");
				int temp = rs.getInt("temp");

				String a = date.substring(4, 6);
				if (month.equals(a)) {
					sum.add(temp);
				}

			}
			for (int i = 0; i < sum.size(); i++) {
				hum += sum.get(i);
			}

			System.out.println("지역 : " + local_name);
			System.out.println("평균 온도 :" + hum / sum.size());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void temp_record_1() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		System.out.println("년도를 입력하시오.");
		String year = sc.next();

		System.out.println("월 입력하시오.");
		int months = sc.nextInt();
		String month = null;

		if (months < 10) {
			month = "0" + Integer.toString(months);
		} else {
			month = Integer.toString(months);
		}

		System.out.println("최대 일수를 입력하시오.");
		int days = sc.nextInt();

		System.out.println("지역번호를 입력하시오.");
		int locID = sc.nextInt();
		int j = 0;
		String str[] = { "wjdalswp11", "wjdalswp12", "wjdalswp13", "wjdalswp14" };
//	      System.out.println("체크한 사람 이름을 적으시오");
//	      writer =sc.next();
		for (int i = 1; i < days + 1; i++) {
			int temp = rdm.nextInt(30) + 1;

			String day = null;

			if (i < 10) {
				day = "0" + Integer.toString(i);
			} else {
				day = Integer.toString(i);
			}

			String temp_day = year + month + day;

			String sql = "insert into temp(Date, Temp, locID, writer)values(?,?,?,?)";

			try {

				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, temp_day);
				psmt.setInt(2, temp);
				psmt.setInt(3, locID);
				psmt.setString(4, str[j]);
				j++;
				if (j == 4) {
					j = 0;
				}
				int result = psmt.executeUpdate();
				if (result == 1) {
					System.out.println("정상적으로 입력 되었습니다.");
				} else {
					System.out.println("입력되지 못했습니다.");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void local() {
		ArrayList<Integer> sum = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int hum = 0;

		System.out.println("지역 이름을 입력하세요");
		String local_name = sc.next();
		String sql = " select loc.id, loc.locname, t.temp , t.date " + " from location loc, temp t "
				+ " where loc.id = t	.locID " + " and loc.locname =" + "'" + local_name + "'" + "";

		try {
			System.out.println(sql);
			Class.forName("com.mysql.jdbc.Driver");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {

				int id1 = rs.getInt("id");
				String locname1 = rs.getString("locname");
				String date = rs.getString("date");
				int temp = rs.getInt("temp");

				sum.add(temp);

				System.out.println("지역고유번호 : " + id1);
				System.out.println(
						"날짜: " + date.substring(0, 4) + "년" + date.substring(4, 6) + "월" + date.substring(6, 8) + "일");
				System.out.println("지역 : " + local_name);
				System.out.println("온도 : " + temp);

			}
			for (int i = 0; i < sum.size(); i++) {
				hum += sum.get(i);
			}
			System.out.println("평균 온도 :" + hum / sum.size());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void local_avg() {
		ArrayList<Integer> temps = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("지역을 입력하세요");
		String location = sc.next();
		System.out.println("검색하실 달을 입력하시오");
		System.out.println("ex)1,2,3,4,5,6,7,8,9,10,11,12");
		int month = sc.nextInt();

		String locName = null;
		String Date = null;
		int temp;
		double sum = 0;

		String sql = "select loc.ID, loc.locName, T.temp, T.Date from location loc, Temp T where loc.ID = T.locID and loc.locName ='"
				+ location + "'";

		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				locName = rs.getString("locName");
				Date = rs.getString("Date");
				temp = rs.getInt("Temp");

				int date = Integer.parseInt(Date.substring(4, 6));
				if (month == date) {
					temps.add(temp);
				}
			}

			for (int i = 0; i < temps.size(); i++) {
				sum += temps.get(i);
			}

			System.out.println(Date);
			System.out.println(locName + "의" + month + "월");
			System.out.println("평균 온도 : " + (int) sum / temps.size() + "°C");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void local_yearavg() {
		ArrayList<Integer> temps = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("지역을 입력하세요");
		String location = sc.next();	

		String locName = null;
		String Date = null;
		temp = (int) rdm.nextInt(30) + 1;
		double sum = 0;

		String sql = "select loc.ID, loc.locName, T.temp, T.Date from location loc, Temp T where loc.ID = T.locID and loc.locName ='"
				+ location + "'";

		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				locName = rs.getString("locName");
				Date = rs.getString("Date");
				temp = rs.getInt("Temp");

				int date = Integer.parseInt(Date.substring(0, 4));
				if (date == 2021) {
					temps.add(temp);
				}
			}

			for (int i = 0; i < temps.size(); i++) {
				sum += temps.get(i);
			}

			System.out.println(locName + "연 평균 온도 : " + sum / temps.size() + "°C");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void rank() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하실 지역의 고유번호를 입력해주세요");
		int local = sc.nextInt();
		String sql = "select loc.locname as location,"
				+ "	t.ranking as ranking,"
				+ "	u.name as nameq"
				+ " from(select id, locname"
				+ "	 from location)loc,"
				+ "	(select id, name"
				+ "	 from user)u,"
				+ "	(select count.writer,"
				+ "		rank()over(order by count.score asc) as ranking,"
				+ "		count.locid"
				+ "	from ( select count(writer)as score, writer, locid"
				+ "		from temp\r\n"
				+ "		where locid = "+ local +""
				+ "		and date like '202101%'"
				+ "		group by writer)count)t"
				+ "where loc.id = t.locid"
				+ "and t.writer = u.id;";


		try {

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				String location= rs.getString("location");
				String	name = rs.getString("name");
				String ranking =rs.getString("ranking");
				
				System.out.println("지역 이름 :"+location);
				System.out.println("이름 : "+ name);
				System.out.println("랭킹:"+ranking );
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		

	}
}
