package tp2;

import java.util.Scanner; // para receber dados do usuário
import java.time.LocalDate; // para trabalhar com datas
import java.time.temporal.ChronoUnit; // para fazer calculo com datas
import java.time.format.DateTimeFormatter; // para ler o formato de data



public class Exercicio4 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		LocalDate dataAtual = LocalDate.now();
		
		
		
		System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
		String dataDigitada = scanner.nextLine();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dataNascimento = LocalDate.parse(dataDigitada, formato);
		
		long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
		
		System.out.println("Sua idade em dias é: " + idadeEmDias + " dias.");
		
		scanner.close();
		
		
		
				
		
	}
}