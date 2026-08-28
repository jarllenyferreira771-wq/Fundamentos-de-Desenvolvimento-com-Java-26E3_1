package br.edu.infnet.fundamentos;

public class Aluno {
	
	String nome;
	double notaTP1;
	double notaTP2;
	double notaTP3;
	
	void imprimir(String nome) {
		System.out.println("Maravilha!!! Bom te receber, " + nome + "!");
	}
	
	double calcularMedia() {
	
		return (notaTP1 + notaTP2 + notaTP3) / 3;
	}

	
	String obterSituacao (double media) {
		
		if (media >= 7) {
	      	return  "Aprovado";
	      } else if (media >= 5 ) {
	      	return "Em recuperação";
	      } else {
	      	return "Reprovado";
	      	
	   
	      }	
	}
	
	void imprimir() {
		double media = calcularMedia();
		String situacao = obterSituacao(media);
		
        System.out.printf("Media = %.1f%n", media);
        System.out.println("Situacao: " + situacao);
	} 
      

}
