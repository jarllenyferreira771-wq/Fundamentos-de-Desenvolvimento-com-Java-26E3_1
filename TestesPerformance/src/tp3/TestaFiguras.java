package tp3;

public class TestaFiguras {
	
	public static void main (String [] args) {
		
		Circulo circulo = new Circulo();
		circulo.raio = 3.0;
		
		System.out.printf("Área do círculo: %.2f%n", circulo.calcularArea());

		
		Esfera esfera = new Esfera();
		esfera.raio = 5.0;
		
		System.out.printf("Volume da esfera: %.2f", esfera.calcularVolume());
	}
	
	
}
