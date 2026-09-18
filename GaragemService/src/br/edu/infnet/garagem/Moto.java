package br.edu.infnet.garagem;

public class Moto extends Veiculo{
	
	private double cilindradas;
	
	
	public Moto(String placa, String marca, int ano, double cilindradas) {
		super(placa, marca, ano);
		this.cilindradas = cilindradas;
	}
	
	@Override
	public void exibirResumo() {
		System.out.printf("Moto: ");
		super.exibirResumo();
		System.out.printf(" - %.2f%n", cilindradas);
	}
	

}
