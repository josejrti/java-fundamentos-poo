package ifpe;
import java.util.ArrayList;

public class Motorista {
	private String nome;
	private String cnh;
	private ArrayList<Viagem> listaViagens;
	
	public Motorista(String nome, String cnh) {
		this.nome = nome;
		this.cnh = cnh;
		this.listaViagens = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addViagem(Viagem viagem) {
		this.listaViagens.add(viagem);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " - CNH: " + cnh);
		System.out.println("Viagens:");
		for(Viagem viagem : listaViagens) {
			System.out.println("De: " + viagem.getOrigem() + " - Para: " + viagem.getDestino());
		}
	}
}
