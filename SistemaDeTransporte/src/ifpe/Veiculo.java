package ifpe;

public class Veiculo {
	private String modelo;
	private String placa;
	private Motorista motorista;
	
	public Veiculo(String modelo, String placa, Motorista motorista) {
		this.modelo = modelo;
		this.placa = placa;
		this.motorista = motorista;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void exibirDados() {
		System.out.println("Modelo: " + modelo + " - Placa: " + placa);
		System.out.println("Motorista: " + motorista.getNome());
	}
}
