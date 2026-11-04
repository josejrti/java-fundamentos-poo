package app;
import java.util.ArrayList;

public class Delegacia {
	private String nome;
	private String endereco;
	private ArrayList<Delegado> listaDelegados;
	private ArrayList<Crime> listaCrimes;
	
	public Delegacia() {
//		Construtor vazio
	}
	
	public Delegacia(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.listaDelegados = new ArrayList<>();
		this.listaCrimes = new ArrayList<>();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setListaDelegados(ArrayList<Delegado> listaDelegados) {
		this.listaDelegados = listaDelegados;
	}
	
	public ArrayList<Delegado> getListaDelegados() {
		return listaDelegados;
	}
	
	public void setListaCrimes(ArrayList<Crime> listaCrimes) {
		this.listaCrimes = listaCrimes;
	}
	
	public ArrayList<Crime> getlistaCrimes(){
		return listaCrimes;
	}
	
	public void addDelegado(Delegado delegado) {
		this.listaDelegados.add(delegado);
	}
	
	public void addCrime(Crime crime) {
		this.listaCrimes.add(crime);
	}
	
	public void exibirDados() {
		System.out.println("\nNome: " + nome + " - Endereço: " + endereco);
		System.out.println("\n--- Lista de delegados:");
		for(Delegado delegado : listaDelegados) {
			System.out.println();
			delegado.exibirDados();
		}
		System.out.println("\n--- Ocorrências registradas:");
		for(Crime crime : listaCrimes) {
			System.out.println();
			crime.exibirDados();
		}
	}
}
