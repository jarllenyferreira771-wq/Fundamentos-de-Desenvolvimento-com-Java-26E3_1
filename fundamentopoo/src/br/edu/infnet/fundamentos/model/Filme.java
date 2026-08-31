package br.edu.infnet.fundamentos.model;

public class Filme {
	
	private String titulo;
	private int ano;
	private double avaliacao;
	
	public void impressao () {		
		System.out.printf("O filme %s lançado em %d possui a avaliação %.1f%n", titulo, ano, avaliacao);
		
		double notaEmEstrelas = calcularNotaEmEstrelas();
		
		System.out.println("Estrelas:" + notaEmEstrelas);	
		
	}
	
	public void exibirResumo() {
		
		double notaEmEstrelas = calcularNotaEmEstrelas();
		
		System.out.println(titulo + "(" +ano+ ") Estrelas:" + notaEmEstrelas);
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public void avaliar (double avaliacao) {
		
		if(avaliacao < 0 || avaliacao > 10) {
			System.err.println("Nota inválida");
			return;
		} 
			
		this.avaliacao = avaliacao;
				
	}
	
	private double calcularNotaEmEstrelas() {
		
		return  avaliacao / 2;	
		
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
}
