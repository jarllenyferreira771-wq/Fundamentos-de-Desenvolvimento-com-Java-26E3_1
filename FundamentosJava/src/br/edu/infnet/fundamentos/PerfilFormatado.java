package br.edu.infnet.fundamentos;

class PerfilFormatado {
    public static void main (String [] args) {

        String nome = "Jarlene Ferreira";
        String profissao = "Programadora";
        int idade = 24; 
        String estado = "Alagoas";
        double altura = 1.47;
        boolean professor = false; 
        String cidade = "Porto Calvo"; 
        double salario = 2.600;
        String empresa = "Amarante Hoteis";

        System.out.println("O meu nome eh " + nome + " e sou " + profissao + "." );
        System.out.println("Tenho " + idade + " anos e sou natural de " + estado +".");
        System.out.println ("Tenho " + altura +  " de altura e sou da cidade de " + cidade+ ".");
        System.out.println("Atualmente, tenho o rendimento de R$ " + salario + " na " + empresa + "!");
        
        
        // condicional
        if ( professor) {
        	System.out.println("Também atuo como professor");
        } else {
        	System.out.println("Nao atuo como professor");
        }
        
       
        // operadores ternários
        String situacao = professor ? "Tambem " : "Nao " ;
        System.out.println(situacao + "atuo como professor");

    }
}