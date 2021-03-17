package com.saraya;

import javax.servlet.annotation.WebServlet;

@WebServlet("/urlpatterns=login.do")
public class LoginService {
	 
	boolean isuservalid ( String user , String password) {
	if(user.equals("cheikhou") && password.equals("code"));
	return true;

}

}