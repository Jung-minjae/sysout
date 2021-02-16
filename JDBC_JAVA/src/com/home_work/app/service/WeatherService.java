package com.home_work.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;

import com.home_work.app.entity.WeatherBeans;
import com.mysql.cj.xdevapi.Statement;

public class WeatherService {
	Scanner scan = new Scanner(System.in);// DAO
	private String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "root";
	private String pw = "wjdrofl1!@";
	private String driver = "com.mysql.jdbc.Driver";
	Connection con;
	Random rdm = new Random();
	WeatherBeans wb = new WeatherBeans();
	
	
	
	
	public void insert() {

		System.out.println("년도를 입력하시오.");
		String year = scan.next();
		
		System.out.println("월 입력하시오.");
		int months = scan.nextInt();
		String month = null;

		if (months < 10) {
			month = "0" + Integer.toString(months);
		} else {
			month = Integer.toString(months);
		}

		System.out.println("최대 일수를 입력하시오.");
		int days = scan.nextInt();

		System.out.println("지역번호를 입력하시오.");
		int locID = scan.nextInt();
		int j = 0;
		System.out.println("사용자 이름을 입력하세요");
		String str = scan.next();

		for (int i = 1; i < days + 1; i++) {

			int temp = rdm.nextInt(30)+1;

			String day = null;

			if (i < 10) {
				day = "0" + Integer.toString(i);
			} else {
				day = Integer.toString(i);
			}

			String temp_day = year + month + day;

			String sql = "insert into temp(Date, Temp, locID, writer)values(?,?,?,?)";

			try {
				con = DriverManager.getConnection(url, root, pw);
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, temp_day);
				psmt.setInt(2, temp);
				psmt.setInt(3, locID);
				psmt.setString(4, str);
		
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

	public void delete() {
		System.out.println("삭제하실 날짜를 입력하세요 (ex)20200120");
		String date = scan.next();
		
		System.out.println("지역번호를 입력하세요");
		int locid = scan.nextInt();
		
		System.out.println("아이디를 입력하세요");
		String id = scan.next();
	
		
		String sql = "delete from temp where Date = "+"'"+ date +"'" + "and locID = "+ locid +" and writer = "+"'"+ id +"'";
		try {
	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
	
			 PreparedStatement psmt = con.prepareStatement(sql);
		

			int result = psmt.executeUpdate();

			System.out.println(result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}


	public void select() {// 조회
		int temp;
		System.out.println("조회하고싶은 달까지 기입하세요 ex)YYYYMM");
		String date = scan.next();
		wb.setDate(date);
		System.out.println("1.서울 2.부산 3.대구 4.인천 5.울산 ");
		System.out.println("6.광주 7.대전 8.제주도 9.세종 10.성남");
		int locid= scan.nextInt();
		String sql ="select * from temp where locid= ? and date like ?";
		
		try {
			
			System.out.println(date);
			System.out.println(locid);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
	
			 PreparedStatement psmt = con.prepareStatement(sql);
			 psmt.setString(2, wb.getDate()+"%");
			 psmt.setInt(1, locid);
		
			 ResultSet rs = psmt.executeQuery();
	
			 System.out.println(rs.next());
			 while(rs.next()) {
	
				 String Date = rs.getString("date");
				 int Locid = rs.getInt("locid");
				 int Temp =rs.getInt("temp");
				 System.out.println("지역 고유번호:"+Locid);
				 System.out.println("날짜:"+Date);
				 System.out.println("온도:"+Temp );
			
			 }
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
//try {
//	String sql = "select * from temp ;
//	con = DriverManager.getConnection(url, root, pw);
// PreparedStatement psmt = con.prepareStatement(sql);
//	ResultSet rs = psmt.executeQuery(sql);
//
//	while (rs.next()) { // DB에 값이 있을때까지 반복
//		temp = rs.getInt("temp");
//		date = rs.getString("date");
//		locid = rs.getInt("locid");
//		System.out.println("지역 고유번호 :" + locid);
//		System.out.println("날짜: " + date.substring(0, 4) + "년" + date.substring(4, 6) + "월" + date.substring(6, 8) + "일");
//		System.out.println("온도: " + temp);
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//	}
//
//	System.out.println("모든 값이 출력되었습니다.");
//
//} catch (Exception e) {
//	e.printStackTrace();
//}

//}