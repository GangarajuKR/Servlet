package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyHome1 extends GenericServlet{
	int count=1;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println(count++ +"-times Servlet is running");
		
		PrintWriter printWriter=arg1.getWriter();
		String name=arg0.getParameter("MyName");
		String Age=arg0.getParameter("MyAge");
		
		
		String msg="<html><body><h1>Name is "+name+"</html></body></h1>";
		
		printWriter.write(msg);
		
	}

}
