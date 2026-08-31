package br.edu.infnet.fundamentos.testes;

import java.util.Scanner;

import br.edu.infnet.fundamentos.model.Aluno;

public class MediaAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.print("Digite o nome do aluno: ");
        aluno.setNome( scanner.nextLine()); 
        
        System.out.print("Digite a nota do TP1: ");
        aluno.setNotaTP1(scanner.nextDouble());
        
        System.out.print("Digite a nota do TP2: ");
        aluno.setNotaTP2(scanner.nextDouble()); 

        System.out.print("Digite a nota do TP3: ");
        aluno.setNotaTP3(scanner.nextDouble());

       aluno.imprimir();
       
        
        scanner.close();
    }
}