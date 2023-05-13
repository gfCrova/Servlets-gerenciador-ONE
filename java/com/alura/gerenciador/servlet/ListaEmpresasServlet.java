package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ListaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	

    public ListaEmpresasServlet() {}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			DB baseDeDatos = new DB();
			List<Empresa> listaEmpresas = baseDeDatos.getEmpresas();
			

			request.setAttribute("empresas", listaEmpresas);
			RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas.jsp");
			rd.forward(request, response);
	}

}