package com.capgemini.collector;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreditCard")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreditCardServlet() {
        super(); 
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String cardNumber=request.getParameter("creditCardNumber");
		String cvv=request.getParameter("cvvNo");
		String year=request.getParameter("expireyYear");
		String month=request.getParameter("expireyMonth");
	String type=request.getParameter("type");
		out.println("<br><br><h4> Card Type :"+type+"<br><br>Credit Card Number: "+cardNumber+ "<br> Expirey month/Year :     "+month+"/"+year+"</h4>");	
		out.close();
	}

}
