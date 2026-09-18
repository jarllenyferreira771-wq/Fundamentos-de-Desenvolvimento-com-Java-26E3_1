package br.edu.infnet.garagem;

public class GaragemApp {

	public static void main(String[] args) {
		
		
		Maquina maquina = new Maquina("Lavadoura");
		maquina.realizarRevisao();
		Carro carro = new Carro("JBL8KB", "BMW", 1990, 2);
		carro.realizarRevisao();
		
		Revisto[] revistos = {maquina, carro};
		
		for (Revisto r : revistos) {
			r.realizarRevisao();
			
		}
		
		Veiculo [] veiculos = new Veiculo[6];
		veiculos [0] = new Carro("ABC1D23", "Toyota", 2024, 4);
		veiculos [1] = new Carro("ABC1B23", "FIAT", 1947, 2);
		veiculos [2] = new Moto ("XYZ9A87", "Honda", 2023, 110);
		veiculos [3] = new Moto ("XYT5A70", "Yamaha", 2026, 250);
		veiculos [4] = new Caminhao ("JHG5E20", "Ford", 2023, 18.5);
		veiculos [5] = carro;
		
		for (Veiculo v : veiculos) {
			
			v.exibirResumo();
			
			double custoManutencao = v.CalcularCustoManutencao();
			
			System.out.printf("Manutenção estimada: R$ %.2f%n", custoManutencao);
			System.out.println("--------------------------------------");
		}
				
		

	}

}
