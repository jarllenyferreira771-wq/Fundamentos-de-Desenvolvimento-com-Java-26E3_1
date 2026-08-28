package br.edu.infnet.fundamentos;

public class Filme {
	
	String titulo;
	int ano;
	double avaliacao;
	
	void impressao () {		
		System.out.printf("O filme %s lançado em %d possui a avaliação %.1f%n", titulo, ano, avaliacao);
		
		double notaEmEstrelas = calcularNotaEmEstrelas();
		
		System.out.println("Estrelas:" + notaEmEstrelas);	
		
	}
	
	void exibirResumo() {
		
		double notaEmEstrelas = calcularNotaEmEstrelas();
		System.out.println(titulo + "(" +ano+ ") Estrelas:" + notaEmEstrelas);
	}
	
	void avaliar (double nota) {
		avaliacao = nota;		
	}
	
	double calcularNotaEmEstrelas() {
		return  avaliacao / 2;	
		
	}
	
	void atualizarAno(int novoAno) {
		ano = novoAno;
	}
}
