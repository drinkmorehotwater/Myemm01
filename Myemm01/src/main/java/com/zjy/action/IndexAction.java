package com.zjy.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/indexaction")
public class IndexAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String message;

    public IndexAction() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String words=new String(request.getParameter("words").getBytes("ISO-8859-1"),"UTF-8");
//		String words=request.getParameter("words");
		out.println("<h1>"+words+"</h1>");
	}
	
	  public void init() throws ServletException
	  {
	      // 执行必需的初始化
	      message = "Hello World";
	  }
}
