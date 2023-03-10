package com.ds.layer5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ds.layer2.Employee;
import com.ds.layer3.Employeeoly;


@WebServlet("/emp")
public class GetAllEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   Employeeoly empDao = new Employeeoly();
   
   
    public GetAllEmployeesServlet() {
        super();
       
    }

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Employee> allEmps = empDao.getEmployees();
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<table border=5>"); //HTML is in the custody of JAVA code 
			
			Iterator<Employee> empIterator = allEmps.iterator();
			
			
			pw.println("<form action='addEmployee'>");

			pw.println("<tr>");

			pw.println("<td>");
			pw.println("<input type=text value='Enter emp no' name='empno'>");
			pw.println("</td>");
			
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp name' name='empname'>");
			pw.println("</td>");
			
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp job' name='empjob'>");
			pw.println("</td>");
			
			pw.println("<td>");
			pw.println("<input type=text value='Enter emp sal' name='empsal'>");
			pw.println("</td>");

			
			pw.println("<td>");
				pw.println("<button>Add</button>");
			pw.println("</td>");
	
			pw.println("</tr>");
			
			pw.println("</form>");


		
			while(empIterator.hasNext()) {
				Employee emp = empIterator.next();

				pw.println("<form action='modifyEmployee'>");


				pw.println("<tr>");

				pw.println("<td>");
					pw.println(emp.getEmployeeNumber());
					pw.println("<input type=hidden name='empno' value='"+emp.getEmployeeNumber()+"'>");

				pw.println("</td>");
			
				pw.println("<td>");
					pw.println("<input type=text name='empname' value='"+emp.getEmployeeName()+"'>");
				pw.println("</td>");
				
				
				pw.println("<td>");
					pw.println("<input type=text name='empjob' value='"+emp.getEmployeeJob()+"'>");
				pw.println("</td>");
				
				
				pw.println("<td>");
					pw.println("<input type=text name='empsal' value='"+emp.getEmployeeSalary()+"'>");
				pw.println("</td>");
				

						
				pw.println("<td>");
					pw.println("<input type=submit name=submit value='Edit'>");
				pw.println("</td>");
			
				pw.println("</form>");

			
			//	System.out.println("deleteEmployee?empno="+emp.getEmployeeNumber());
				
			
				
				pw.println("<form action='deleteEmployee'>");
					
					pw.println("<input type=hidden name='empno' value='"+emp.getEmployeeNumber()+"'>");
					pw.println("<td>");
						pw.println("<input type=submit name=submit value='Delete'>");
					pw.println("</td>");
					
				pw.println("</form>");

				
				pw.println("</tr>");

			}
			
			
		pw.println("</table>");
		
	
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
