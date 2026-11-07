package ifpe;
import java.util.ArrayList;

public class Delegacia {
	private String nome;
	private String endereco;
	private Delegado delegado;
	private ArrayList<Crime> listaCrimes = new ArrayList<>();
	
	public Delegacia(String nome, String endereco, Delegado delegado) {
		this.nome = nome;
		this.delegado = delegado;
		this.endereco = endereco;
	}

	public Delegacia() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Delegado getDelegado() {
		return delegado;
	}

	public void setDelegado(Delegado delegado) {
		this.delegado = delegado;
	}

	public ArrayList<Crime> getListaCrimes() {
		return listaCrimes;
	}

	public void setListaCrimes(ArrayList<Crime> listaCrimes) {
		this.listaCrimes = listaCrimes;
	}
	
}
