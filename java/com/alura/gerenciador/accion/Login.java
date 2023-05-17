package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramLogin = request.getParameter("login");
		String paramPassword = request.getParameter("password");
		
		DB db = new DB();
		Usuario usuario = db.existeUsuario(paramLogin, paramPassword);
		
		if(usuario != null) {
			return "redirect:entrada?accion=FormLogin";
		} else {
			System.out.println("Existe el Usuario!!");
			return "redirect:entrada?accion=ListarEmpresas";
	
		}
	}

}
