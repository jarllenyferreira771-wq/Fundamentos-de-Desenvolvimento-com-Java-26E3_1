package tp3;

public class Produto {
	
	String nome;
	double preco;
	int quantidadeEmEstoque;
	
	public Produto(String nome, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;	
	}
	
	public void alterarPreco (double preco) {
		this.preco = preco;
		
		} 
			
	public void alterarQuantidade (int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		
		} 
	
	public void exibirInformacoes() {
		System.out.println("Nome do produto: " +nome+ 
				" | Preço: " +preco+ 
				" | quantidadeEmEstoque: " +quantidadeEmEstoque);
	}
	
	public String getNome(){
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	
	public void setQuantidadeEmEstoque(int novaQuantidade) {
		this.quantidadeEmEstoque = novaQuantidade;
	}

}
