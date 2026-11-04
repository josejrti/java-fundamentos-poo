package ifpe;
import java.util.ArrayList;

public class Passageiro {
	private String nome;
	private String cpf;
	private ArrayList<Viagem> listaViagens;
	
	public Passageiro(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.listaViagens = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addViagem(Viagem viagem) {
		this.listaViagens.add(viagem);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " - CPF: " + cpf);
		for(Viagem viagem : listaViagens) {
			System.out.println("De: " + viagem.getOrigem() + " - Para: " + viagem.getDestino());
		}
	}
}
