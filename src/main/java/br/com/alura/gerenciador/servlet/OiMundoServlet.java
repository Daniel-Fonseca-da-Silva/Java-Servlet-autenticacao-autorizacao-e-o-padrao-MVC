package br.com.alura.gerenciador.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// oi
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("Servlet em inglês significa um servidozinho!");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");

		System.out.println("Servelt OiMundoServlet foi chamado!");

	}

}
