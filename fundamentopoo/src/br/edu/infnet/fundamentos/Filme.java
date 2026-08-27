package br.edu.infnet.fundamentos;

public class Filme {
	
	String titulo;
	int ano;
	double avaliacao;
	
	void impressao () {
		
		System.out.printf("O filme %s lançado em %d possui a avaliação %.1f%n", titulo, ano, avaliacao);

	}

}
