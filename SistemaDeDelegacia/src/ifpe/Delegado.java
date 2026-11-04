package ifpe;
import java.util.ArrayList;

public class Delegado {
	private String nome;
	private String matricula;
	private ArrayList<Crime> listaCrimes;
	
	public Delegado(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.listaCrimes = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addCrime(Crime crime) {
		this.listaCrimes.add(crime);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " - Matrícula: " + matricula);
	}
}
