package com.alura.gerenciador.accion;

import java.io.IOException;
import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostrarEmpresas {

	public void ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Mostrando la empresa " + id);

		DB db = new DB();
		
		Empresa empresa = db.buscarEmpresaPorId(id);
		
		System.out.println(empresa.getNombre());
		
		request.setAttribute("empresas", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/FormModificarEmpresa.jsp");
		rd.forward(request, response);
		
	}
}
