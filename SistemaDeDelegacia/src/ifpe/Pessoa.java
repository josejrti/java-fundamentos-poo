package ifpe;
import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private String cpf;
	private ArrayList<Crime> listaCrimes;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.listaCrimes = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addCrime(Crime crime) {
		this.listaCrimes.add(crime);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " - CPF: " + cpf);
	}
}
