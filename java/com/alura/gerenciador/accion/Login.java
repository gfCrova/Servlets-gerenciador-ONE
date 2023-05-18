package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramLogin = request.getParameter("login");
		String paramPassword = request.getParameter("password");
		
		DB db = new DB();
		Usuario usuario = db.existeUsuario(paramLogin, paramPassword);
		
		if(usuario != null) {
			System.out.println("Login " + paramLogin);
			
			HttpSession sesion = request.getSession();
			sesion.setAttribute("LoginUsuario", usuario);
			return "redirect:entrada?accion=ListarEmpresas";
		} else {
			System.out.println("No existe el usuario!");
			return "redirect:entrada?accion=FormLogin";
			
		}
	}

}
