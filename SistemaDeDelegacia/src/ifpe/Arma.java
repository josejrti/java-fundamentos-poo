package ifpe;

public class Arma {
	private int id;
	private String tipo;
	private String descricao;
	
	public Arma(int id, String tipo, String descricao) {
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public void exibirDados() {
		System.out.println("Arma: " + tipo + " - ID: " + id + " - Descrião: " + descricao);
	}
}
