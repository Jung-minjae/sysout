package com.servlet.web;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hi")

public class Servlet_test extends HttpServlet {
	protected void service(HttpServletRequest req, // 입력
			HttpServletResponse res) { // 출력

		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTP-8");
		PrintWriter out;

		try {
			out = res.getWriter();
			for(int i = 0; i<=10; i++)
				
			out.println((i+1)+": 안녕 servlet! <br >");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
