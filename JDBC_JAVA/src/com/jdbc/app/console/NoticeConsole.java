package com.jdbc.app.console;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.jdbc.app.entity.Notice;
import com.jdbc.app.service.NoticeService;

public class NoticeConsole {
	private int page;
	private NoticeService ns;
	private int count;
	public NoticeConsole() {
		ns = new NoticeService();
		page = 1;
		count =0;
	}

	public void printNoticeList() { // 글목록
		count=ns.getCount();
		List<Notice> list = ns.getList(page);
		System.out.println("--------------------------------------");
		System.out.println("<공지사항> 총"+count+"건의 게시글");
		System.out.println("--------------------------------------");

		for (Notice n : list) {
			int id = n.getId();
			String title = n.getTitle();
			String writer_id = n.getWriter_id();
			Date date = n.getRegdate();
			System.out.println(id + "." + title + " / " + writer_id + " / " + date);

		}

	}	

	public int inputMenu() { // 메뉴

		Scanner sc = new Scanner(System.in);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.날씨 입력 2. 날씨 update 3. 지역 insert 4. 지역update 5. 지역삭제 6.사용자추가 7.사용자 삭제 8.우수사원출력 9, 끝내기)");
		int menu = sc.nextInt();
		
		return menu;
	}

	public void movePrevList() {
		if(page==1) {
			System.out.println("페이지가 존재하지 않습니다");
			return;
		}
		page--;
	}

	public void moveNextList() {
	
		page++;
	}
}
