package br.edu.infnet.fundamentos.testes;

import br.edu.infnet.fundamentos.model.Filme;

public class TestaFilme {
	
	public static void main (String [] args) {
		
		Filme filmeJay = new Filme(null, 0);
		filmeJay.avaliar(0);
		filmeJay.exibirResumo();
		
		Filme filmeMatrix = new Filme("Matrix", 2000); 
		filmeMatrix.avaliar(-5);
		filmeMatrix.impressao();
		
		
		Filme filmeInterestelar = new Filme("Interestelar", 2014);
		filmeInterestelar.avaliar(10);
		filmeInterestelar.impressao();
		filmeInterestelar.exibirResumo();
		
		Filme outroFilme = new Filme("Interestelar", 2014); 
		outroFilme.avaliar(10);
		outroFilme.impressao();
		
		
		
	}

}
