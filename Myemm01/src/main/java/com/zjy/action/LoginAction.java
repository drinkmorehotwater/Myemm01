package com.zjy.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zjy.api.User;
import com.zjy.service.LoginService;

@WebServlet("/loginaction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginAction() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = new String(request.getParameter("formusername"));
		String userPassword = new String(request.getParameter("formpassword"));
		User user = new LoginService().find(userName);
		out.println("<h1>22</h1>");
		if (!userName.equals(user.getLoginName())) {
			out.println("<h1>noUser</h1>");
		} else if (!userPassword.equals(user.getPassword())) {
			out.println("<h1>wrongpassword</h1>");
		} else {
			out.println("<h1>true</h1>");
		}
	}

}
