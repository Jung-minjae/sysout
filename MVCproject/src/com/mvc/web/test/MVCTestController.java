package com.mvc.web.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class MVCTestController extends HttpServlet {

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	String result = "이경민은 이현수에게 빵을 사주었다.";
//
//	req.setAttribute("result", result);
//	
//	String number = "10";
//	req.setAttribute("b", number);
//	
	
	
	
	
	
	RequestDispatcher dis =req.getRequestDispatcher("WEB-INF/view/test/MVCTest.jsp");
	 dis.forward(req, resp);
}
}
