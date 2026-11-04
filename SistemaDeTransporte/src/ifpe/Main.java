package ifpe;

public class Main {
	public static void main(String[] args) {
		Empresa transporteRapido = new Empresa("Transporte Rápido");
		Motorista motorista = new Motorista("Lucas Silva", "MCBR5-DBR202671");
		Veiculo veiculo = new Veiculo("Toyota SW4", "DSA-MKM882", motorista);
		Passageiro passageiro = new Passageiro("Mariana Souza", "281.321.321.321");
		Viagem viagem1 = new Viagem(1, "Recife", "São Paulo", passageiro, motorista, veiculo);
		Viagem viagem2 = new Viagem(2, "João Pessoa", "Rio De Janeiro", passageiro, motorista, veiculo);
		
		transporteRapido.addMotorista(motorista);
		transporteRapido.addVeiculo(veiculo);
		transporteRapido.addViagem(viagem1);
		transporteRapido.addViagem(viagem2);
		
		motorista.addViagem(viagem1);
		motorista.addViagem(viagem2);
		
		passageiro.addViagem(viagem1);
		passageiro.addViagem(viagem2);
		
		transporteRapido.exibirDados();
	}
}
