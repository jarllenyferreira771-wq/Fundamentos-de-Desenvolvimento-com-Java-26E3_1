package br.edu.infnet.fundamentos;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);
        
        System.out.print("Digite a nota do TP1: ");
        double notaTP1 = notas.nextDouble();

        System.out.print("Digite a nota do TP2: ");
        double notaTP2 = notas.nextDouble();

        System.out.print("Digite a nota do TP3: ");
        double notaTP3 = notas.nextDouble();

        double media = (notaTP1 + notaTP2 + notaTP3) / 3;
        
        String situacao = null;
        
        
        if (media >= 7) {
        	situacao = "Aprovado";
        } else if (media >= 5 ) {
        	situacao = "Em recuperação";
        } else {
        	situacao = "Reprovado";
        }
        
        System.out.printf("Media = %.1f%n", media);
        System.out.println("Situacao: " + situacao);
        
        notas.close();
    }
}