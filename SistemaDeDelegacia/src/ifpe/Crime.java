package ifpe;

public class Crime {
	private int id;
	private String descricao;
	private String local;
	private Pessoa criminoso;
	private Pessoa vitima;
	private Arma arma;
	private Delegado delegado;
	
	public Crime(int id, String descricao, String local, Pessoa criminoso, Pessoa vitima, Arma arma, Delegado delegado) {
		this.id = id;
		this.descricao = descricao;
		this.local = local;
		this.criminoso = criminoso;
		this.vitima = vitima;
		this.arma = arma;
		this.delegado = delegado;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Descrição: " + descricao);
		System.out.println("Local: " + local + " - Crimininoso: " + criminoso.getNome());
		System.out.println("Vitima: " + vitima.getNome() + " - Delegado: " + delegado.getNome());
		arma.exibirDados();
	}
}
