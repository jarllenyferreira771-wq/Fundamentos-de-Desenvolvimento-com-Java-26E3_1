package tp2;

import java.util.Scanner;

public class Exercicio9{
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String senha = null;
		
		String confirmacaoSenha = null;
		
		do {
			
			System.out.print("Crie uma nova senha: ");
			senha = scanner.nextLine();
			
			System.out.print("Confirme sua nova senha: ");
			confirmacaoSenha = scanner.nextLine();
			
			if (!confirmacaoSenha.equals(senha)) {
				System.out.println("As senhas não conferem!");
			}
							
			
		} while (!confirmacaoSenha.equals(senha));
		
		
		System.out.println("Senha criada com sucesso!");
		
		scanner.close();
		
	}
}