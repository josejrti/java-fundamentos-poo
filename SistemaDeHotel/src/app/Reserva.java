package app;

public class Reserva {
	private int numero;
	private String dataEntrada;
	private String dataSaida;
	private String status;
	private Quarto quarto;
	private Conta conta;
	
	public Reserva() {
//		Construtor Vazio
	}
	
	public Reserva(int numero, String dataEntrada, String dataSaida, String status, Quarto quarto, Conta conta) {
		this.numero = numero;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.status = status;
		this.quarto = quarto;
		this.conta = conta;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public String getDataEntrada() {
		return dataEntrada;
	}
	
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public String getDataSaida() {
		return dataSaida;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void exibirDados() {
		System.out.println("Número: " + numero + " - Data entrada: " + dataEntrada +
				" - Data saída: " + dataSaida);
		System.out.println("Status: " + status + " - Quarto: " + quarto.getNumero());
		System.out.println("\n- Conta da reserva:");
		conta.exibirDados();
		}
}
