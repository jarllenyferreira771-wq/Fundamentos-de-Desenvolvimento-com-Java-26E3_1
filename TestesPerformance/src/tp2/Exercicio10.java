package tp2;

import java.util.Scanner;
import java.util.Random;

public class Exercicio10{
	
	public static void main (String [] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	Random random = new Random();
	
	int numeroEscolhido = 0;
	int numeroAleatorio = 0;
	
	
	
	do {
		
		System.out.println("********** Jogo de Adivinhação **********");
		
		System.out.print("Escolha um número de 1 a 100: ");
		numeroEscolhido = scanner.nextInt();
		
		if ( numeroEscolhido >= 1 && numeroEscolhido <= 100) {
				
			numeroAleatorio = random.nextInt(100) + 1;
			
			if (numeroEscolhido == numeroAleatorio) {
			System.out.printf("Parabéns, Você acertou!%nNúmero escolhido: %d%n Nnúmero sorteado: %d%n", numeroEscolhido, numeroAleatorio);	
			
			} else if (numeroEscolhido > numeroAleatorio) {
				System.out.printf("Não foi dessa vez!%nO número escolhido é maior que o número sorteado%nNúmero escolhido: %d%nNúmero sorteado: %d%n", numeroEscolhido, numeroAleatorio);
			} else {
				System.out.printf("Não foi dessa vez!%nO número escolhido é menor que o número sorteado%nNúmero escolhido: %d%nNúmero sorteado: %d%n", numeroEscolhido, numeroAleatorio );
			}
			
		} else {
			System.out.println("Número inválido");
		
		}
		
		
		
	} while (numeroEscolhido != numeroAleatorio);
	 
	scanner.close();
	
	}
}