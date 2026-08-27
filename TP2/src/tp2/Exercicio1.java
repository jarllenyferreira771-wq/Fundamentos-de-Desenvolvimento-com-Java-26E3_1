package tp2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		
	Scanner scanner = new Scanner(System.in);
	String nomeCompleto;
	int idade;
	String nomeMae;
	String nomePai;
	
	

	
	System.out.print("Nome completo:");
	nomeCompleto = scanner.nextLine();
	
	System.out.print ("Idade: ");
	idade = Integer.parseInt(scanner.nextLine());
	
	
		
	System.out.print("Nome da mãe: ");
	nomeMae = scanner.nextLine();
	
	System.out.print("Nome do pai: ");
	nomePai = scanner.nextLine();
	
	System.out.println("Nome completo: " + nomeCompleto);
	System.out.println("Idade: " + idade);
	System.out.println("Nome da mãe: " + nomeMae);
	System.out.println("Nome do pai: " + nomePai);
	
	if( nomeCompleto.length() > nomeMae.length() && nomeCompleto.length() > nomePai.length() ) {
		System.out.println("Seu nome tem mais letras que o nome da sua mãe e o do seu pai.");
	} else if (nomeCompleto.length() > nomeMae.length()) {
		System.out.println("Seu nome tem mais letras que o nome da sua mãe.");
	} else if (nomeCompleto.length() > nomePai.length()) {
		System.out.println("Seu nome tem mais letras que o nome do seu pai.");
	} else {
		System.out.println("Seu nome não é maior que o nome dos seus pais.");
	}
		
	
	scanner.close();
	
	}
}