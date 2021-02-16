package Weather_Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class weatherConsole {
	weather wt = new weather();
	Connection con = wt.con;
	
	public int Choice() { // 메뉴

		Scanner sc = new Scanner(System.in);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.날씨 입력 2. 날씨 update 3. 지역 insert 4. 지역update 5. 지역삭제 6.사용자추가 7.사용자 삭제 8.우수사원출력 9, 끝내기)");
		int menu = sc.nextInt();

		return menu;
	}

	public void input() {

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
		System.out.println("사용자 이름을 입력하세요");
		String str = sc.next();

		for (int i = 1; i < days + 1; i++) {
			System.out.println("온도를 입력하세요");
			int temp = sc.nextInt();

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
				psmt.setString(4, str);
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

	public void update() {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("수정하실 날짜를 입력해주세요");
		String Date = sc.next();

		System.out.println("수정하실 온도를 입력해주세요");
		int temp = sc.nextInt();

		System.out.println("수정하실 지역 번호를 입력해주세요");
		int locid = sc.nextInt();

		System.out.println("수정 하신분의 아이디를 입력해주세요");
		String writer = sc.next();

		String sql = "update temp set (Temp= ?, locId= ?, writer= ?) where Date= ?";
		try {
			
			PreparedStatement psmt = con.prepareStatement(sql);
		
			psmt.setInt(1, temp);
			psmt.setInt(2, locid);
			psmt.setString(3, writer);
			psmt.setString(4, Date);

			int result = psmt.executeUpdate();

			System.out.println(result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
