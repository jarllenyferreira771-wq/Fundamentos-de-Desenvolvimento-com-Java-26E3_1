package br.edu.infnet.fundamentos.testes;

import java.util.Scanner;

import br.edu.infnet.fundamentos.model.Aluno;

public class MediaAluno {

    public static void main(String[] args) {
    	
    	
        Scanner scanner = new Scanner(System.in);
        
        Aluno aluno1 = null;
        
        System.out.print("Digite o nome do aluno: ");
        aluno1 = new Aluno(scanner.nextLine());
        
        System.out.print("Digite a nota do TP1: ");
        aluno1.setNotaTP1(scanner.nextDouble());
        
        System.out.print("Digite a nota do TP2: ");
        aluno1.setNotaTP2(scanner.nextDouble()); 

        System.out.print("Digite a nota do TP3: ");
        aluno1.setNotaTP3(scanner.nextDouble());

        aluno1.imprimir();
        
        Aluno aluno2 = null;
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
               
        System.out.print("Digite a nota do TP1: ");
        double notaTP1 = scanner.nextDouble();
               
        System.out.print("Digite a nota do TP2: ");
        double notaTP2 = scanner.nextDouble();

        System.out.print("Digite a nota do TP3: ");
        double notaTP3 = scanner.nextDouble();
        
        aluno2 = new Aluno (nome, notaTP1, notaTP2, notaTP3);
      
        aluno2.imprimir();
       
        
        scanner.close();
    }
}