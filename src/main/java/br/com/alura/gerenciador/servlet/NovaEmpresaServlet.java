package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Date dataAbertura = null;
		Empresa empresa = new Empresa();
		Banco banco = new Banco();
		
		System.out.println("cadastrando nova empresa");
		String nomeEmpresa = request.getParameter("nome");
		String dataDaAbertura = request.getParameter("data");
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataDaAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		empresa.setId(1);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);

		banco.adiciona(empresa);

		request.setAttribute("empresa", empresa.getNome());
		
		response.sendRedirect("lista-empresas.jsp");
		
		// ChamarJSP
//		RequestDispatcher rd = request.getRequestDispatcher("/lista-empresas");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
	}

}
