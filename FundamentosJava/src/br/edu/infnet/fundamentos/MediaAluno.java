package br.edu.infnet.fundamentos;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        
        System.out.print("Digite a nota do TP1: ");
        aluno.notaTP1 = scanner.nextDouble();

        System.out.print("Digite a nota do TP2: ");
        aluno.notaTP2 = scanner.nextDouble();

        System.out.print("Digite a nota do TP3: ");
        aluno.notaTP3 = scanner.nextDouble();

             
       aluno.imprimir();
        
        scanner.close();
    }
}