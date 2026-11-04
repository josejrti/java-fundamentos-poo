package ifpe;
import java.util.ArrayList;

public class Delegacia {
	private String nome;
	private String endereco;
	private ArrayList<Delegado> listaDelegados;
	private ArrayList<Crime> listaCrimes;
	
	public Delegacia(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.listaDelegados = new ArrayList<>();
		this.listaCrimes = new ArrayList<>();
	}

	public void addDelegado(Delegado delegado) {
		this.listaDelegados.add(delegado);
	}
	
	public void addCrime(Crime crime) {
		this.listaCrimes.add(crime);
	}
	
	public void exibirDados() {
		System.out.println("----- Delegacia: " + nome + " -----");
		System.out.println("\nEndereço: " + endereco);
		System.out.println("\nLista de delegados:\n");
		for (Delegado delegado : listaDelegados) {
			delegado.exibirDados();
		}
		System.out.println("\nLista de crimes:\n");
		for (Crime crime : listaCrimes) {
			crime.exibirDados();
		}
	}
}
