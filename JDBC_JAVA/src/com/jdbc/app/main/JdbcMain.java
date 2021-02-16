package com.jdbc.app.main;

import com.jdbc.app.console.NoticeConsole;

public class JdbcMain {

	public static void main(String[] args) {
		
		boolean run = true;
		
		NoticeConsole nc = new NoticeConsole();
		exit:
		while (run) {
			nc.printNoticeList();
			int menu = nc.inputMenu();
			switch (menu) {
			case 1:
				// 상세조회
				break;
			case 2:
				
				// 이전
				nc.movePrevList();
				break;
			case 3:
				// 다음
				nc.moveNextList();
				break;

			case 4:
				// 글쓰기

				break;
			case 5:
				
				System.out.println("bye");
				break exit;

			}
		}
	}

}
