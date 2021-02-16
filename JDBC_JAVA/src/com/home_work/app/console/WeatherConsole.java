package com.home_work.app.console;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import com.home_work.app.service.WeatherService;
import com.home_work.app.entity.*;

public class WeatherConsole {
	private Scanner scan = new Scanner(System.in);
	private WeatherService ws;

	public WeatherConsole() {
		ws = new WeatherService();
	}

	public int choice_menu() { // �ֻ��� �޴�
		System.out.println("[1]�µ� ���� [2] �µ� ��ȸ [3] ���� ���� [4] ���� ��ȸ [5] ����� ���� [6] ������ ��ȸ [7]����");
		int menu = scan.nextInt();
		return menu;
	}

	public void temp_management() { // [1]�µ� �Է� [�߰�, ����]
		boolean run = true;
		while (run) {
			System.out.println("[1]�߰�,[2]����,[3]������");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				// �߰�
				ws.insert();
				break;
			case 2:
				ws.delete();
				// ����

				break;
			case 3:
				// ������
				run = false;
				break;
			}
		}
	}

	public void input_temp_insert() { // [2 ]�µ� ��ȸ

	

	}

	public void temp_search() {
		ws.select();
	}

	public void location_management() {

	}

	public void location_search() {

	}

	public void user_management() {

	}

	public void user_ranking() {

	}
}
