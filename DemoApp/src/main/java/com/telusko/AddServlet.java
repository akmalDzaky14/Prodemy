package com.telusko;
/* 
 * History: 
 * 8. RequestDispatcher and Calling Servlet on Servlet
 * 9. sendRedirect and URL Rewriting
 * 10. Session and Cookie
 * */

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// Receive variable value from Client request ('submit' from index.html)
		int dataNum1 = Integer.parseInt(req.getParameter("num1"));
		int dataNum2 = Integer.parseInt(req.getParameter("num2"));

		int addData = dataNum1 + dataNum2;

		// Calling HttpSessions method and create a session
		HttpSession session = req.getSession();
		
		// Assign data to variable "data1"
		session.setAttribute("data1", addData);
		
		// send data to /sq url-pattern
		res.sendRedirect("sq");
	}
}
