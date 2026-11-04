package ifpe;
import java.util.ArrayList;

public class Empresa {
	private String nome;
	private ArrayList<Motorista> listaMotoristas;
	private ArrayList<Veiculo> listaVeiculos;
	private ArrayList<Viagem> listaViagens;
	
	public Empresa(String nome) {
		this.nome = nome;
		this.listaMotoristas = new ArrayList<>();
		this.listaVeiculos = new ArrayList<>();
		this.listaViagens = new ArrayList<>();
	}
	
	public void addMotorista(Motorista motorista) {
		this.listaMotoristas.add(motorista);
	}
	
	public void addVeiculo(Veiculo veiculo) {
		this.listaVeiculos.add(veiculo);
	}
	
	public void addViagem(Viagem viagem) {
		this.listaViagens.add(viagem);
	}
	
	public void exibirDados() {
		System.out.println("----- Empresa: " + nome + " -----");
		System.out.println("\nLista de Motoristas:\n");
		for (Motorista motorista : listaMotoristas) {
			motorista.exibirDados();
		}
		System.out.println("\nLista de Veiculos:\n");
		for (Veiculo veiculo : listaVeiculos) {
			veiculo.exibirDados();
		}
		System.out.println("\nLista de Viagens:\n");
		for (Viagem viagem : listaViagens) {
			viagem.exibirDados();
		}
	}
}
