package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.alura.gerenciador.accion.EliminarEmpresa;
import com.alura.gerenciador.accion.ListarEmpresas;
import com.alura.gerenciador.accion.MostrarEmpresas;
import com.alura.gerenciador.accion.ModificarEmpresa;

@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		String paramAccion = request.getParameter("accion");
		
		
		if(paramAccion.equals("ListarEmpresas")) {
			
			ListarEmpresas accion = new ListarEmpresas();
			accion.ejecutar(request, response);
			
		} else if(paramAccion.equals("MostrarEmpresas")) {
			
			MostrarEmpresas accion = new MostrarEmpresas();
			accion.ejecutar(request, response);
			
		} else if(paramAccion.equals("ModificarEmpresa")) {
			
			ModificarEmpresa accion = new ModificarEmpresa();
			accion.ejecutar(request, response);
		
		} else if(paramAccion.equals("EliminarEmpresas")) {
			
			EliminarEmpresa accion = new EliminarEmpresa();
			accion.ejecutar(request, response);
			
		} else if(paramAccion.equals("EliminarEmpresas")) {
			
			EliminarEmpresa accion = new EliminarEmpresa();
			accion.ejecutar(request, response);
		}
	}

}
