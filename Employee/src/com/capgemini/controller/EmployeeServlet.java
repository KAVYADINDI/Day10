package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.capgemini.controller.Employee;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmployeeDetails")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> list= new ArrayList<>(); ;

 public EmployeeServlet() {
        super();
    }
@Override
public void init() throws ServletException {
	list.add(new Employee ("12S1","kavya","A",20000));
	list.add(new Employee ("12S2","mahanvi","B",25000));
	list.add(new Employee ("12S3","Chaithanya","C",21000));
	list.add(new Employee ("12S4","Tom","A",15000));
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int count=0;
		String id=request.getParameter("employeeIdNo");
		for (Employee employee : list) {
			if(employee.getEmployeeIdNumber().equals(id))
			{
				count=1;
				out.println("<table border='1'><tr><th>Employee Name</th><th>Department</th><th>Salary</th></tr>");
				out.println("<tr><td>"+employee.getName()+"</td><td>"+employee.getDepartment()+"</td><td>"+employee.getSalary()+"</td></tr></table>");
			}
		}
		if(count==0)
		{
			out.println("Add a valid ID number");
		out.println("<br> <a href='Employee.html'>Try again</a>");
		}
		out.close();
	}

}
