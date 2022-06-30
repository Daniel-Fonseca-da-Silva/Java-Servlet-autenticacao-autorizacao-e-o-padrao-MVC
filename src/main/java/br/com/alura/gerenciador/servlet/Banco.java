package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empre1 = new Empresa();
		Empresa empre2 = new Empresa();
		empre1.setNome("Oracle");
		empre1.setId(1);
		empre2.setNome("Red Hat Foundation");
		empre2.setId(2);
		lista.add(empre1);
		lista.add(empre2);
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
