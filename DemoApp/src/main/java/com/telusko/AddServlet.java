package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int dataNum1 = Integer.parseInt(req.getParameter("num1"));
		int dataNum2 = Integer.parseInt(req.getParameter("num2"));

		int addData = dataNum1 + dataNum2;

		PrintWriter out = res.getWriter();

		out.println("Result is " + addData);
	}
}
