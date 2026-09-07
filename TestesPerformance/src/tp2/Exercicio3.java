package tp2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		
		// Cotação feita em 24/08/2026
		
		double cambioDolar = 5.15;
		double cambioEuro = 6.01;
		double cambioLibra = 7.02;
		
		Scanner scanner = new Scanner(System.in);
		
		int opcaoEscolhida = 0;
	
		
		
		
		do {
			
			System.out.println("------Calculadora de Cambio------");
			System.out.println("Opção 1 - Converter Real para Dolar");
			System.out.println("Opção 2 - Converter Real para Euro");
			System.out.println("Opção 3 - Converter Real para Libra");
			System.out.println("Opção 9 - Sair");
			System.out.println("----------------------------------");
			
			System.out.println("Digite a operação desejada: ");
			opcaoEscolhida = scanner.nextInt();

			if (opcaoEscolhida >= 1 && opcaoEscolhida <= 3) {
				
				System.out.println("Digite o valor em real");
				double valorEmReal = scanner.nextDouble();
				
				double valorConvertido = 0;
				
				switch (opcaoEscolhida) {
				
				case 1: 
					 valorConvertido =   valorEmReal / cambioDolar;
					System.out.printf("R$%.2f equivale a US$%.2f%n", valorEmReal, valorConvertido);
					
					break;
					
				case 2: 
					 valorConvertido = valorEmReal / cambioEuro;
					 System.out.printf("R$%.2f equivale a €%.2f%n", valorEmReal, valorConvertido);
					
					break;
					
				case 3: 
					 valorConvertido = valorEmReal / cambioLibra;
					 System.out.printf("R$%.2f equivale a £%.2f%n", valorEmReal, valorConvertido);
					
					break;
				}
				
				} else if(opcaoEscolhida == 9) {
					System.out.println("Até a próxima operação!!");
				} else {
					System.out.println("Opção inválida!");
				}
			
		} while (opcaoEscolhida != 9);
	
		
					
		
scanner.close();
		
	}
	

}