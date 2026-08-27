package tp2;

import java.util.Scanner;

public class Exercicio12{
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva uma frase: ");
		String frase = scanner.nextLine();
		
		String[] partes = frase.split(" ");
		
		System.out.println("A frase: '" +frase+  "' contém " +partes.length+ " palavras");
		
		scanner.close();
	}
}