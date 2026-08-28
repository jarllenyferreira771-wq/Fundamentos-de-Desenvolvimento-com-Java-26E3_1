package br.edu.infnet.fundamentos;

public class TestaFilme {
	
	public static void main (String [] args) {
		
		Filme filmeJay = new Filme();
		filmeJay.avaliar(0);
		filmeJay.exibirResumo();
		
		Filme filmeMatrix = new Filme();
		filmeMatrix.titulo = "Matrix";
		filmeMatrix.ano = 1999;
		filmeMatrix.avaliar(9.5);
		filmeMatrix.atualizarAno(2000);
		filmeMatrix.impressao();
		
		
		Filme filmeInterestelar = new Filme();
		filmeInterestelar.titulo = "Interestelar";
		filmeInterestelar.ano = 2014;
		filmeInterestelar.avaliar(10);
		filmeInterestelar.impressao();
		filmeInterestelar.exibirResumo();
		
		Filme outroFilme = new Filme();
		outroFilme.titulo = "Interestelar";
		outroFilme.ano = 2014;
		outroFilme.avaliar(10);
		outroFilme.impressao();
		
		
		
	}

}
