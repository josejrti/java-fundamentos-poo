package app;

public class Arma {
	private String tipo;
	private String descricao;
	
	public Arma() {
//		Construtor vazio
	}
	
	public Arma(String tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void exibirDados() {
		System.out.println("\nTipo: " + tipo + " - Descrição: " + descricao);
	}
}
