package com.alura.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//@WebFilter(urlPatterns = "/entrada")
public class AutorizacionFilter implements Filter {

	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Autorización Filter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAccion = request.getParameter("accion");
		
		HttpSession sesion = request.getSession();
		
		Boolean noEstaLogueado = (sesion.getAttribute("LoginUsuario") == null);
		Boolean noEsUnaAccionProtegida = !(paramAccion.equals("Login") || paramAccion.equals("FormLogin"));
		
		if(noEstaLogueado && noEsUnaAccionProtegida) {
			response.sendRedirect("entrada?accion=FormLogin");
			return;
		}
		
		chain.doFilter(request, response);
	}

}
