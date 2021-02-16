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

	public int choice_menu() { // 최상위 메뉴
		System.out.println("[1]온도 관리 [2] 온도 조회 [3] 지역 관리 [4] 지역 조회 [5] 사용자 관리 [6] 우수사원 조회 [7]종료");
		int menu = scan.nextInt();
		return menu;
	}

	public void temp_management() { // [1]온도 입력 [추가, 삭제]
		boolean run = true;
		while (run) {
			System.out.println("[1]추가,[2]삭제,[3]끝내기");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				// 추가
				ws.insert();
				break;
			case 2:
				ws.delete();
				// 삭제

				break;
			case 3:
				// 끝내기
				run = false;
				break;
			}
		}
	}

	public void input_temp_insert() { // [2 ]온도 조회

	

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
