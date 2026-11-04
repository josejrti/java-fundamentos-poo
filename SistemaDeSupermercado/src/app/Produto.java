package app;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	
	public Produto() {
//		Construtor vazio
	}
	
	public Produto(int id, String nome, String descricao, double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome);
		System.out.println("Descrição: " + descricao + " - Preço: " + preco);
	}
}
