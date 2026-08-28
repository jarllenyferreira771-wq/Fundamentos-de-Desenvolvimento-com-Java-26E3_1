package br.edu.infnet.fundamentos;

public class Profissional {
	
	String nome ;
    String profissao;
    int idade; 
    String estado;
    double altura;
    boolean professor ; 
    String cidade ; 
    double salario;
    String empresa;
    
    void impressao() {
    	  System.out.println("O meu nome eh " + nome + " e sou " + profissao + "." );
          System.out.println("Tenho " + idade + " anos e sou natural de " + estado +".");
          System.out.println ("Tenho " + altura +  " de altura e sou da cidade de " + cidade+ ".");
          System.out.println("Atualmente, tenho o rendimento de R$ " + salario + " na " + empresa + "!");
          
          
          String situacao = professor ? "Tambem " : "Nao " ;
          System.out.println(situacao + "atuo como professor");
    }

}
