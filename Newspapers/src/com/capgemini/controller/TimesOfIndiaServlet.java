package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TimesOfIndia")
public class TimesOfIndiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public TimesOfIndiaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href=\"https://timesofindia.indiatimes.com/\">Redirect ..</a>");
		out.close();
	}

}
