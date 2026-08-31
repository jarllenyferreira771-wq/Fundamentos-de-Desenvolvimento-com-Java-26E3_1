package br.edu.infnet.fundamentos.testes;

import br.edu.infnet.fundamentos.model.Filme;

public class TestaFilme {
	
	public static void main (String [] args) {
		
		Filme filmeJay = new Filme();
		filmeJay.avaliar(0);
		filmeJay.exibirResumo();
		
		Filme filmeMatrix = new Filme();
		filmeMatrix.setTitulo("Matrix"); 
		filmeMatrix.avaliar(-5);
		filmeMatrix.setAno(2000);
		filmeMatrix.impressao();
		
		
		Filme filmeInterestelar = new Filme();
		filmeInterestelar.setTitulo("Interestelar");
		filmeInterestelar.setAno(2014);
		filmeInterestelar.avaliar(10);
		filmeInterestelar.impressao();
		filmeInterestelar.exibirResumo();
		
		Filme outroFilme = new Filme();
		outroFilme.setTitulo("Interestelar");
		outroFilme.setAno(2014); 
		outroFilme.avaliar(10);
		outroFilme.impressao();
		
		
		
	}

}
