package ifpe;

public class Viagem {
	private int id;
	private String origem;
	private String destino;
	private Passageiro passageiro;
	private Motorista motorista;
	private Veiculo veiculo;
	
	public Viagem(int id, String origem, String destino, Passageiro passageiro, Motorista motorista, Veiculo veiculo) {
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.passageiro = passageiro;
		this.motorista = motorista;
		this.veiculo = veiculo;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Passageiro: " + passageiro.getNome());
		System.out.println("Origem: " + origem + " - Destino: " + destino);
		System.out.println("Motorista: " + motorista.getNome() + " - Veiculo: " + veiculo.getModelo());
	}
}
