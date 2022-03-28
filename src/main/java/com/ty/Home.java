package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Home extends GenericServlet {

	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		int count=1;
		System.out.println(count++ +"time Servlet is running");
		PrintWriter printWriter=arg1.getWriter();
		String msg="<html><body><h1>Welcome to server</html></body></h1>";
		printWriter.write(msg);
	}

}
