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

	public void printNoticeList() { // �۸��
		count=ns.getCount();
		List<Notice> list = ns.getList(page);
		System.out.println("--------------------------------------");
		System.out.println("<��������> ��"+count+"���� �Խñ�");
		System.out.println("--------------------------------------");

		for (Notice n : list) {
			int id = n.getId();
			String title = n.getTitle();
			String writer_id = n.getWriter_id();
			Date date = n.getRegdate();
			System.out.println(id + "." + title + " / " + writer_id + " / " + date);

		}

	}	

	public int inputMenu() { // �޴�

		Scanner sc = new Scanner(System.in);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("1.���� �Է� 2. ���� update 3. ���� insert 4. ����update 5. �������� 6.������߰� 7.����� ���� 8.��������� 9, ������)");
		int menu = sc.nextInt();
		
		return menu;
	}

	public void movePrevList() {
		if(page==1) {
			System.out.println("�������� �������� �ʽ��ϴ�");
			return;
		}
		page--;
	}

	public void moveNextList() {
	
		page++;
	}
}
