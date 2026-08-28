package br.edu.infnet.fundamentos;

public class Aluno {
	
	String nome;
	double notaTP1;
	double notaTP2;
	double notaTP3;
	double media;
	String situacao;
	
	
	
	
	void imprimir(String nome) {
		System.out.println("Maravilha!!! Bom te receber, " + nome + "!");
	}
	
	void calcularMedia() {
		media = (notaTP1 + notaTP2 + notaTP3) / 3;
	}
	
	void imprimir() {
		  
        System.out.printf("Media = %.1f%n", media);
        System.out.println("Situacao: " + situacao);
	}

}
