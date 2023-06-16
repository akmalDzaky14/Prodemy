package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// Receive variable value from Client request ('submit' from index.html)
		int dataNum1 = Integer.parseInt(req.getParameter("num1"));
		int dataNum2 = Integer.parseInt(req.getParameter("num2"));

		int addData = dataNum1 + dataNum2;

		// Notion: Attributes in Servlets | Java
		req.setAttribute("data1", addData);

		// Calling other Servlet
		RequestDispatcher reqDispatch1 = req.getRequestDispatcher("sq");

		// forward variable/object value to other 'req' object (receive with
		// "getAttribute")
		reqDispatch1.forward(req, res);
	}
}
