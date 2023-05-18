package com.alura.gerenciador.accion;

import java.io.IOException;
import java.util.List;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ListarEmpresas implements Accion{
	
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		if(sesion.getAttribute("LoginUsuario") == null) {
			return "redirect:entrada?accion=FormLogin";
		}
		
		System.out.println("Listando las empresas");
		
		DB baseDeDatos = new DB();
		List<Empresa> listaEmpresas = baseDeDatos.getEmpresas();
		

		request.setAttribute("empresas", listaEmpresas);
		
		return "forward:ListarEmpresas.jsp";
	}

}
