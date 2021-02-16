package com.mvc.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.User;
import user.UserDao;

@WebServlet("/join")

public class JoinController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/join.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("userID");
		String pass = req.getParameter("userPASS");
		String name = req.getParameter("userName");
		String gender = req.getParameter("userGender");
		String email = req.getParameter("userEmail");

		User us = new User();

		us.setUserID(id);
		us.setUserPASS(pass);
		us.setUserName(name);
		us.setUserGender(gender);
		us.setUserEmail(email);

		UserDao ud = new UserDao();

		ud.join(us);

	}

}