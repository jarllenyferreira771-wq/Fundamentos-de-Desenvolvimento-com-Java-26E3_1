package br.edu.infnet.fundamentos;

import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nome = null;
        int idade = 0;
        double altura = 0;
        
        boolean nomeVazio = false;

        do {
	        System.out.print("Nome: ");
	        nome = in.nextLine();
	        
	        nomeVazio = nome.isBlank();
	        
	        if (nomeVazio) {
	        	System.out.println("O campo nome não pode ficar vazio");
	        } 
        
        } 
         while(nomeVazio);
        
        
        do {
        	System.out.print("Idade: ");
            idade = in.nextInt();
            
            
            if (idade < 0 || idade > 120) {
            	System.out.println("Informe uma idade maior que 0 e menor que 120");
            }

        } 
        while (idade < 0 || idade > 120);

        do {
        	System.out.print("Altura: ");
            altura = in.nextDouble();
            
            if(altura < 0 || altura > 3.0) {
            	System.out.println("Informe uma altura maior que 0 e menor que 3.0");
            }
        }
        while(altura < 0 || altura > 3.0);
        
        
        System.out.println("Eu sou " +nome+ ", tenho " +idade+ " anos e " +altura+ " de altura.");
        
        if (idade < 0) {
        	System.out.println("Não foi possível definir a faixa etária pela idade informada!");
        } else {       	
        	String faixaEtaria = null;
        
	        if (idade < 12) {
	        	faixaEtaria = "Criança";
	        } else if (idade < 18) {
	        	faixaEtaria = "Adolescente";
	        } else if (idade < 60) {
	        	faixaEtaria = "Adulto";	
	        } else {
	        	faixaEtaria = "Idoso";
	        }
	        System.out.println("Faixa etaria: " +faixaEtaria);
        }
        

        in.close();
    }
}