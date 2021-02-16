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

		System.out.println("�⵵�� �Է��Ͻÿ�.");
		String year = scan.next();
		
		System.out.println("�� �Է��Ͻÿ�.");
		int months = scan.nextInt();
		String month = null;

		if (months < 10) {
			month = "0" + Integer.toString(months);
		} else {
			month = Integer.toString(months);
		}

		System.out.println("�ִ� �ϼ��� �Է��Ͻÿ�.");
		int days = scan.nextInt();

		System.out.println("������ȣ�� �Է��Ͻÿ�.");
		int locID = scan.nextInt();
		int j = 0;
		System.out.println("����� �̸��� �Է��ϼ���");
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
					System.out.println("���������� �Է� �Ǿ����ϴ�.");
				} else {
					System.out.println("�Էµ��� ���߽��ϴ�.");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void delete() {
		System.out.println("�����Ͻ� ��¥�� �Է��ϼ��� (ex)20200120");
		String date = scan.next();
		
		System.out.println("������ȣ�� �Է��ϼ���");
		int locid = scan.nextInt();
		
		System.out.println("���̵� �Է��ϼ���");
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


	public void select() {// ��ȸ
		int temp;
		System.out.println("��ȸ�ϰ���� �ޱ��� �����ϼ��� ex)YYYYMM");
		String date = scan.next();
		wb.setDate(date);
		System.out.println("1.���� 2.�λ� 3.�뱸 4.��õ 5.��� ");
		System.out.println("6.���� 7.���� 8.���ֵ� 9.���� 10.����");
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
				 System.out.println("���� ������ȣ:"+Locid);
				 System.out.println("��¥:"+Date);
				 System.out.println("�µ�:"+Temp );
			
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
//	while (rs.next()) { // DB�� ���� ���������� �ݺ�
//		temp = rs.getInt("temp");
//		date = rs.getString("date");
//		locid = rs.getInt("locid");
//		System.out.println("���� ������ȣ :" + locid);
//		System.out.println("��¥: " + date.substring(0, 4) + "��" + date.substring(4, 6) + "��" + date.substring(6, 8) + "��");
//		System.out.println("�µ�: " + temp);
//		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤ�");
//	}
//
//	System.out.println("��� ���� ��µǾ����ϴ�.");
//
//} catch (Exception e) {
//	e.printStackTrace();
//}

//}