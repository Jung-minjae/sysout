package com.mvc.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.User;
import user.UserDao;

@WebServlet("/login")

public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao ud = new UserDao();
		String id = req.getParameter("userID");
		String pass = req.getParameter("userPASS");

		System.out.println(id);
		System.out.println(pass);

		int log = ud.login(id, pass);
		
		if(log ==-1) {
			System.out.println("�α��� ����");
			resp.sendRedirect("login");
		}else if(log ==0) {
			System.out.println("�α��� ����");
			resp.sendRedirect("login");
		}else if(log ==1) {
			System.out.println("�α��� ����");
			resp.sendRedirect("main");
		}
		
//		String userID = null;
//		if(session.getAttribute("userID") != null){
//			userID = (String)session.getAttribute("userID");
//		}
//		
//		if(userID != null){
//			PrintWriter script = response.getWriter();
//			script.println("<script>");
//			script.println("alert('�̹� �α����� �Ǿ� �ֽ��ϴ�')");
//			script.println("location.href='main.jsp'");
//			script.println("</script>");
//		}
//		UserDao userdao = new UserDao();
//		int result = userdao.login(user.getUserID(), user.getUserPASS());
//		if(result==1){  //�α��� ����
//			session.setAttribute("userID", user.getUserID());
//			PrintWriter script = response.getWriter();
//			script.println("<script>");
//			script.println("location.href ='main.jsp'");
//			script.println("</script>");
//		}else if(result==0){  //�н����� �߸� ��
//			PrintWriter script = response.getWriter();
//			script.println("<script>");
//			script.println("alert('��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.')");
//			script.println("history.back()'");
//			script.println("</script>");
//		}else if(result==-1){  //���Ե��� ���� ���̵�
//			PrintWriter script = response.getWriter();
//			script.println("<script>");
//			script.println("alert('���Ե��� ���� ���̵��Դϴ�.')");
//			script.println("history.back()'");
//			script.println("</script>");	
//		}else if(result==-2){  // db ����
//			PrintWriter script = response.getWriter();
//			script.println("<script>");
//			script.println("alert('DB �����Դϴ�..')");
//			script.println("history.back()'");
//			script.println("</script>");
	      String login = Integer.toString(log);
	      
	      System.out.println(log);


//		ud.login(id,pass);
//
//	     req.setAttribute("login", login);
//		req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);

	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	      req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);


}
}