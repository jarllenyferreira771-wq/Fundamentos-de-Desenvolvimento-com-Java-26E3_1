package br.edu.infnet.fundamentos;

class Fundamentos {
	public static void main(String[] args){
		
	if (args.length < 3 ) {
		System.out.println("Uso incorreto!");
		return;
	}
	
	String nome = args[0];
	String profissao = args[1];
	String instituicao = args[2];

	System.out.println(nome);
	System.out.println(profissao);
	System.out.println(instituicao);
		
		for (int i = 0; i <= 11; i++) {
			System.out.println(i);
			
		}
	}
}