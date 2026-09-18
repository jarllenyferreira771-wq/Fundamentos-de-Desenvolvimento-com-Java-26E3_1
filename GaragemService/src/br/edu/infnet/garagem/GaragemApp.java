package br.edu.infnet.garagem;

public class GaragemApp {

	public static void main(String[] args) {
		
		Veiculo [] veiculos = new Veiculo[5];
		veiculos [0] = new Carro("ABC1D23", "Toyota", 2024, 4);
		veiculos [1] = new Carro("ABC1B23", "FIAT", 1947, 2);
		veiculos [2] = new Moto ("XYZ9A87", "Honda", 2023, 110);
		veiculos [3] = new Moto ("XYT5A70", "Yamaha", 2026, 250);
		veiculos [4] = new Caminhao ("JHG5E20", "Ford", 2023, 18.5);
		
		for (Veiculo v : veiculos) {
			
			if (v instanceof Carro) {
				System.out.println("Carro");	
			} else if (v instanceof Moto) {
				System.out.println("Moto");
			} else if (v instanceof Moto) {
				System.out.println("Caminhão");
			} else {
				System.out.println("Nada");
			}
				
			
			v.exibirResumo();
			
		}
				
		

	}

}
