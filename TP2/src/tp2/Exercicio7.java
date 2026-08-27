package tp2;

import java.util.Scanner;

public class Exercicio7{
	
	public static void main (String [] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o valor do salário");
	double salarioBruto = scanner.nextDouble();
	
	double valorImposto = 0;
	
	if (salarioBruto > 5000) {
		valorImposto = salarioBruto * 0.2;
	} else if (salarioBruto >= 3000) {
		valorImposto = salarioBruto * 0.15;
	} else if (salarioBruto >= 2000) {
		valorImposto = salarioBruto * 0.10;	
	} else {
		valorImposto = 0;
	}
	
	double salarioLiquido = salarioBruto - valorImposto;
	
	System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
	System.out.printf("Imposto: R$ %.2f%n",valorImposto);
	System.out.printf("Salário Liquido: R$ %.2f%n", salarioLiquido);
	
	scanner.close();
	}
}