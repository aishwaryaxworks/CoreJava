package com.xworkz.football.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/message", loadOnStartup = 15)
public class MessageServlet extends HttpServlet {

	private LocalDateTime ldt;

	public MessageServlet() {
		System.out.println("Created message servlet...");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init in servlet...");
	}

	//overriding not recommended only for study purpose...
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method inside servlet...");
		super.service(req, res);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Do Get in message servlet...");

		// make sure parameter name is same as the name given in this -->> <input type="text" name="nome"/>
		String name = req.getParameter("nome");
		String msg = req.getParameter("msg");
		System.out.println("Name:" + name);
		System.out.println("Msg:" + msg);

		// resp.setContentType("text/plain");
		resp.setContentType("text/html");

		PrintWriter pw = resp.getWriter();
		pw.print("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + "\r\n"
				+ "<title>Xworkz</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n" + "</head>\r\n" + "<body>\r\n" + "<nav class=\"navbar bg-primary\" data-bs-theme=\"dark\">\r\n"
				+ "<ul class=\"nav justify-content-end\">\r\n" + "  <!-- <li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Active</a>\r\n" + "  </li> -->\r\n"
				+ "  <li class=\"nav-item\">\r\n" + "    <a class=\"nav-link\" href=\"index.html\">Home</a>\r\n"
				+ "  </li>\r\n" + "  <!-- <li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link\" href=\"#\">Link</a>\r\n" + "  </li>\r\n" + "  <li class=\"nav-item\">\r\n"
				+ "    <a class=\"nav-link disabled\" aria-disabled=\"true\">Disabled</a>\r\n" + "  </li> -->\r\n"
				+ "</ul>\r\n" + "</nav>\r\n" + "	<form action=\"message\">");
		pw.print("<h1>");
		pw.print("Name: " + name);
		pw.println("</br>");
		pw.print("</br> Message:" + msg);
		pw.println("</br>");
		pw.print("</br>Saved successfully...!");
		pw.println("</br>");
		pw.print("</h1>");
		pw.print("</form>");
		pw.print(
				"<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\r\n"
						+ "");
		pw.print("</body>");
		pw.print("</html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method in servlet...");
		super.destroy();
	}

}
