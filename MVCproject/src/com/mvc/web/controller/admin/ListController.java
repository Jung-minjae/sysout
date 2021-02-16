package com.mvc.web.controller.admin;


import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;
@WebServlet("/admin/board/notice/list")//4
public class ListController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.setCharacterEncoding("UTF-8");
	resp.setCharacterEncoding("text/html; charset=UTF-8");
	
	String[] openIds =req.getParameterValues("open");
	String[] delIds = req.getParameterValues("del");
	String cmd =req.getParameter("cmd");
	
	

	switch(cmd) {
	case "�ϰ�����":
		for(String s : openIds) {
			System.out.println("open: "+s);
		}
		break;
		
	case "�ϰ�����":
//		for(String s : delIds) {
//			System.out.println("del : "+s);
//		}
		int [] ids=new int[delIds.length];
		for(int i=0; i<ids.length; i++) {
			ids[i]=Integer.parseInt(delIds[i]);
		}
		NoticeService ns = new NoticeService();
		int result = ns.deleteNoticeAll(ids);
		
		break;
	}
	resp.sendRedirect("list");
}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NoticeService ns = new NoticeService();
		//�Ķ���͹޴°�
		String page_ = req.getParameter("p");
		String field_ = req.getParameter("f");
		String query_ = req.getParameter("q");
		
		
		//�Ű����� �ʱ�ȭ
		
		int page =1;
		String field = "title";
		String query = "";
		
		//null �� ���� �� �Ű����� �Է�
		
		if(page_!=null && !page_.equals("")) {
			page = Integer.parseInt(page_);
		}
		if(field_ != null && !field_.equals("")) {
			field = field_;
		}
		if(query_ != null && !query_.equals("")) {
			query =query_;
		}

		System.out.println("page : "+ page);
		System.out.println("filed:"+ field);
		System.out.println("query:"+ query);

		List<Notice> list =ns.getNoticeList(page,field,query); //1
		
		int count =0;
		count=ns.getNoticeCount(field,query);
		System.out.println(count);
		
		req.setAttribute("noticeList", list);//2 //list ������
		req.setAttribute("count", count); // ��ȸ�� ��� ����
		req.getRequestDispatcher("/WEB-INF/view/admin/board/notice/list.jsp").forward(req, resp);//3

}
}
