package br.edu.infnet.fundamentos;

import java.util.Scanner;

public class Calculadora {
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        int resultado = 0;
        int primeiroNumero = 0;
        int segundoNumero = 0;

        
        
        do {
        	System.out.println("  Calculadora!!!");
            
            
            
            System.out.println("-----------------");
            
            System.out.println(" 1 - Somar");
            System.out.println(" 2 - Subtrair");
            System.out.println(" 3 - Multiplicar");
            System.out.println(" 4 - Dividir");
            System.out.println(" 5 - Resto");
            System.out.println(" 9 - Sair");
            
            System.out.println("-----------------");
            
            System.out.println("Escalha a operaçao: ");
            operacao = scanner.nextInt();
            
            if (operacao >= 1 && operacao <= 5) {
            	
            	
            	System.out.print("Digite o primeiro numero: ");
                primeiroNumero = scanner.nextInt();
              

                System.out.print("Digite o segundo numero: ");
                segundoNumero = scanner.nextInt();
                
                switch (operacao) {
				case 1:
					resultado = primeiroNumero + segundoNumero;
                    System.out.println("Soma: " + resultado);
               	
					
					break;
					
                case 2:
                	resultado = primeiroNumero - segundoNumero;
                    System.out.println("Subtracao: " + resultado);	
					
					break;	
                case 3:
                	 resultado = primeiroNumero * segundoNumero;
                     System.out.println("Multiplicacao: " + resultado);	
					
					break;
                case 4:
                	if(segundoNumero == 0) {
                		System.out.println("Erro: não é possível dividir por 0!");
                	} else {
                		 resultado = primeiroNumero / segundoNumero;
                         System.out.println("Divisao: " + resultado);               		
                	}
	
	                break;
                case 5:
                	if(segundoNumero == 0) {
                		System.out.println("Erro: não é possível calcular resto por 0!");
                	} else {
                		resultado = primeiroNumero % segundoNumero;
                        System.out.println("Resto: " + resultado);
                	}
	
	            break;
				
				}
            	     	
            
    	}else if (operacao == 9) {
        	System.out.println("Até a próxima operação!!!");
        } else {
        	System.out.println(" Opção inválida");
        }
        	
        }
        while(operacao != 9);
        scanner.close();
   }
}
	
	
        

	
	
        
	
    	
    

    
     
        
	
