package tp2;

import java.util.Scanner;

public class Exercicio8{
	
	public static void main (String [] argas) {
	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("----------Classificação de triângulos--------");
		
		System.out.print("Digite o tamanho do primeiro lado: ");
		double lado1 = scanner.nextDouble();
		
		System.out.print("Digite o tamanho do segundo lado: ");
		double lado2 = scanner.nextDouble();
		
		System.out.print("Digite o tamanho do terceiro lado: ");
		double lado3 = scanner.nextDouble();
		
			
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Classificação: Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
				System.out.println("Classificação: Isósceles");
			} else {
				System.out.println("Classificação: Escaleno");
			}
		} else {
			System.out.println("Os lados informados não formam um triângulo!!");
		}
			

		
		scanner.close();
	}
	
}