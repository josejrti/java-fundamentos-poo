package ifpe;

public class Crime {
	private int id;
	private String descricao;
	private String local;
	private Criminoso criminoso;
	private Vitima vitima;
	private Arma arma;
	private Delegado delegado;
	
	public Crime(int id, String descricao, String local, Criminoso criminoso, Vitima vitima, Arma arma, Delegado delegado) {
		this.id = id;
		this.descricao = descricao;
		this.local = local;
		this.criminoso = criminoso;
		this.vitima = vitima;
		this.arma = arma;
		this.delegado = delegado;
	}
	
	public Crime() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Criminoso getCriminoso() {
		return criminoso;
	}

	public void setCriminoso(Criminoso criminoso) {
		this.criminoso = criminoso;
	}

	public Vitima getVitima() {
		return vitima;
	}

	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Delegado getDelegado() {
		return delegado;
	}

	public void setDelegado(Delegado delegado) {
		this.delegado = delegado;
	}
	
}
