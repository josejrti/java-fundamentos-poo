package app;
import java.util.ArrayList;

public class Delegado {
	private String nome;
	private String matricula;
	private ArrayList<Crime> listaCrimes;
	
	public Delegado() {
//		Construtor vazio
	}
	
	public Delegado(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.listaCrimes = new ArrayList<>();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setListaCrimes(ArrayList<Crime> listaCrimes) {
		this.listaCrimes = listaCrimes;
	}
	
	public ArrayList<Crime> getListaCrimes() {
		return listaCrimes;
	}
	
	public void addCrime(Crime crime) {
		this.listaCrimes.add(crime);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " - Matricula: " + matricula);
	}
	
}
