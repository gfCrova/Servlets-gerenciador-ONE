package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaDeEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		Empresa empresa2 = new Empresa();
		empresa1.setNombre("Meta");
		empresa2.setNombre("Samsung");
		listaDeEmpresas.add(empresa1);
		listaDeEmpresas.add(empresa2);
	}
	
	public void agregarEmpresa(Empresa empresa) {
		DB.listaDeEmpresas.add(empresa);
	} 
	
	
	public List<Empresa> getEmpresas() {
		return DB.listaDeEmpresas;
	}
}
