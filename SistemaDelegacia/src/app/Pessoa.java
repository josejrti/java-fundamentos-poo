package app;
import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private String cpf;
	private ArrayList<Crime> listaCrimes;
	
	public Pessoa() {
//		Construtor vazio
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.listaCrimes = new ArrayList<>();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setListaCrimes(ArrayList<Crime> listaCrimes) {
		this.listaCrimes = listaCrimes;
	}
	
	public ArrayList<Crime> getListaCrimes(){
		return listaCrimes;
	}
	
	public void addCrime(Crime crime) {
		this.listaCrimes.add(crime);
	}
	
	public void exibirDados() {
		System.out.println("Nome" + nome + " - CPF: " + cpf);
	}
}
