package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public Loginservlet() {
        super();
        
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println(" to get");
			
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String res=("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>THE STATE BANK OF INDIA</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>THE STATE BANK OF INDIA</h1>\r\n"
				+ "<label>UserName</label>\r\n"
				+ "<input type=\"text\" name=\"usernname\" required/><br></br><br>\r\n"
				+ "<label>Password</label>\r\n"
				+ "<input type=\"text\" name=\"password\" required/>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
		response.getWriter().write(res);

		
		
			}

}
