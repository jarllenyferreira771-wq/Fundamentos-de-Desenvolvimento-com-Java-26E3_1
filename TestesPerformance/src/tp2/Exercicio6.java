package tp2;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um ano (yyyy):");
		int ano = scanner.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.printf("O ano de %d é um ano bissexto", ano);
		}else {
			System.out.printf("O ano de %d não é um ano bissexto", ano);
		}
		
		scanner.close();
	}
}