package tp2;

import java.util.Scanner;

public class Exercicio2{
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		String situacao;
		
		if (media >= 7) {
			situacao = "Aprovado";
		} else if (media >= 5) {
			situacao = "Em recuperação";
		} else {
			situacao = "Reprovado";
		}
		 
		System.out.printf("Media: %.1f \n", media);
		System.out.printf("Situação: %s ", situacao);
	
				
		scanner.close();
		
		
	}
	
}