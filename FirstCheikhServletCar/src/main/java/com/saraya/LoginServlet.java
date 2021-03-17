package com.saraya;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet {

	private static final LoginService LoginService = null;
	LoginService service =  LoginService;
	
	protected void doGet(HttpServletRequest request , HttpServletResponse response)
	  throws  ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/login.jdp").forward(request , response);
	}
	
	protected void doPost(HttpServletRequest request , HttpServletResponse response)
			  throws  ServletException, IOException{
		
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isValidUser = valid.isValideUser(name, password);
		
		  if(isValidUser) {
			  request.getSession().setAttribute("TestName", name);
			  request.getSession().setAttribute("MyPassword", password);
		  }
		
				request.getRequestDispatcher("/WEB-INF/views/weclome.jdp").forward(request , response);
			}
}
