package com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaDeEmpresas = new ArrayList<>();
	private static List<Usuario> listaDeUsuarios = new ArrayList<>();
	private static Integer llaveSecuencial = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		Empresa empresa2 = new Empresa();
		empresa1.setNombre("Coca Cola");
		empresa2.setNombre("Samsung");
		empresa1.setId(DB.llaveSecuencial++);
		empresa2.setId(DB.llaveSecuencial++);
		listaDeEmpresas.add(empresa1);
		listaDeEmpresas.add(empresa2);
		
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		u1.setLogin("Carlos");
		u2.setLogin("Laura");
		u1.setPassword("12345");
		u2.setPassword("12345");
		listaDeUsuarios.add(u1);
		listaDeUsuarios.add(u2);
	}
	
	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(DB.llaveSecuencial++);
		DB.listaDeEmpresas.add(empresa);
	} 
	
	
	public List<Empresa> getEmpresas() {
		return DB.listaDeEmpresas;
	}


	public void eliminarEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaDeEmpresas.iterator();
		while(it.hasNext()) {
			Empresa empresa = it.next();
			if(empresa.getId() == id) {
				it.remove();
			}
		}
		
	}

	public Empresa buscarEmpresaPorId(Integer id) {
		for (Empresa empresa : listaDeEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}


	public Usuario existeUsuario(String paramLogin, String paramPassword) {
		for (Usuario usuario : listaDeUsuarios) {
			if(usuario.esIgual(paramLogin, paramPassword)) {
				return usuario;
			}
		}
		return null;
	}
}
