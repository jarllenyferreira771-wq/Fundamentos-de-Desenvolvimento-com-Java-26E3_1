package br.edu.infnet.garagem;

public class Maquina implements Revisto{
	
	private String nome;
	
	public Maquina(String nome) {
		this.nome = nome;
	}

	@Override
	public void realizarRevisao() {
		System.out.printf("Revisando a máquina: %s%n", nome);
		
	}

}
