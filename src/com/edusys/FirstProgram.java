package com.edusys;

import com.edusys.model.Gato;

public class FirstProgram {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Gato gato_w = new Gato();
		Livros livros = new Livros();
		
		// TODO Auto-generated method stub
		/*int a = 2;
		int v = 2;
		*/
		String abc = "Joao";
		
		gato.setNome(abc);
		gato.setCor("azul");
		gato.setIdade(42);
		gato_w.setNome("Joana");
		gato_w.setCor("verde");
		gato_w.setIdade(21);
		System.out.println(gato);
		System.out.println(gato_w);
		System.out.println(livros);
	}

}

class Livros {
	private String nome;
	private String npag;
	
}