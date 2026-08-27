package tp2;

import java.util.Scanner;

public class Exercicio11{
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor inicial: ");
		int valorInicial = scanner.nextInt();
		
		System.out.print("Digite um incremento: ");
		int incremento = scanner.nextInt();
		
		
		for (int i = valorInicial; i - incremento <= 100; i += incremento) {
			System.out.print(i +", ");
			
		}
		
		scanner.close();
	}
}