package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaDeEmpresas = new ArrayList<>();
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
}
