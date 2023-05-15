package com.alura.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MostrarEmpresa")
public class MostrarEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
	
		DB db = new DB();
		
		Empresa empresa = db.buscarEmpresaPorId(id);
		
		System.out.println(empresa.getNombre());
		
		request.setAttribute("empresas", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/FormModificarEmpresa.jsp");
		rd.forward(request, response);
			
	}

}
