package app;

public class Crime {
	private int id;
	private String descricao;
	private String local;
	private Pessoa criminoso;
	private Pessoa vitima;
	private Arma arma;
	private Delegado delegado;
	
	public Crime() {
//		Construtor vazio
	}
	
	public Crime(int id, String descricao, String local, Pessoa criminoso, Pessoa vitima, Arma arma, Delegado delegado) {
		this.id = id;
		this.descricao = descricao;
		this.local = local;
		this.criminoso = criminoso;
		this.vitima = vitima;
		this.arma = arma;
		this.delegado = delegado;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setCriminoso(Pessoa criminoso) {
		this.criminoso = criminoso;
	}
	
	public Pessoa getCriminoso() {
		return criminoso;
	}
	
	public void setVitima(Pessoa vitima) {
		this.vitima = vitima;
	}
	
	public Pessoa getVitima() {
		return vitima;
	}
	
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public Arma getArma() {
		return arma;
	}
	
	public void setDelegado(Delegado delegado) {
		this.delegado = delegado;
	}
	
	public Delegado getDelegado() {
		return delegado;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Descrição: " + descricao + " - Local: " + local);
		System.out.println("Criminoso: " + criminoso.getNome() + " - Vitima: " + vitima.getNome());
		System.out.println("Delegado responsável: " + delegado.getNome());
		System.out.println("\n- Dados Da Arma:");
		arma.exibirDados();
	}
}
