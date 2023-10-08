package com.xworkz.football.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register", loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {
	public RegisterServlet() {
		System.out.println("register servlet running...");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method in register servlet...");
		super.init(config);
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method in register servlet...");
		super.service(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post in register servlet");
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		
		//resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("Name:".concat(name).concat(" "));
		pw.println("Last Name:".concat(surname).concat(" "));
		pw.println("Email:".concat(email).concat(" "));
		pw.println("Password:".concat("XXXXXX").concat(" "));
		pw.println("Confirm Password:".concat("XXXXXX").concat(" "));
		pw.println("Saved successfully...!");
	}
}
