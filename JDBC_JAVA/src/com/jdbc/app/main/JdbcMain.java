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
				// ����ȸ
				break;
			case 2:
				
				// ����
				nc.movePrevList();
				break;
			case 3:
				// ����
				nc.moveNextList();
				break;

			case 4:
				// �۾���

				break;
			case 5:
				
				System.out.println("bye");
				break exit;

			}
		}
	}

}
