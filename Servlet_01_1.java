package pl.zadanie1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_01_1")
public class Servlet_01_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> lang = new  HashMap<>();
		lang.put("en", "Hello");
		lang.put("pl", "Cześć");
		lang.put("de", "Ehre");
		lang.put("es", "Hola");
		lang.put("fr", "Bienvenue");
	
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter()
		.append("<div>")
		.append("<form type")
		
		
		.append("</div>");
	
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
