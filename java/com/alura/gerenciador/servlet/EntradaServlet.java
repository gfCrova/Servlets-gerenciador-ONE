package com.alura.gerenciador.servlet;

import java.io.IOException;

import com.alura.gerenciador.accion.Accion;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String paramAccion = request.getParameter("accion");
		/*HttpSession sesion = request.getSession();
		
		Boolean noEstaLogueado = (sesion.getAttribute("LoginUsuario") == null);
		Boolean noEsUnaAccionProtegida = !(paramAccion.equals("Login") || paramAccion.equals("FormLogin"));
		
		if(noEstaLogueado && noEsUnaAccionProtegida) {
			response.sendRedirect("entrada?accion=FormLogin");
			return;
		}*/
		
		String nombreDeClase = "com.alura.gerenciador.accion." + paramAccion;
		String nombre;
		
		try {
			Class clase = Class.forName(nombreDeClase); // Clase Genérica
			Accion accion = (Accion) clase.newInstance();
			nombre = accion.ejecutar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException | IOException e) {
			throw new ServletException(e);
		}
		
		
		String[] tipoDireccion = nombre.split(":");
		
		if(tipoDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoDireccion[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoDireccion[1]);
		}
	}

}
