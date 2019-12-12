package com.zjy.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginaction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginAction() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String userName=new String(request.getParameter("formusername"));
        String userPassword=new String(request.getParameter("formpassword"));
        System.out.println("username:"+userName);
        System.out.println("userpassword:"+userPassword);
        out.println("<h1>"+userName+"</h1>");
	}

}
