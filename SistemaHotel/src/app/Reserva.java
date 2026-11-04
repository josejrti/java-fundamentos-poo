package app;

public class Reserva {
	private int codigo;
	private String dataEntrada;
	private String dataSaida;
	private String status;
	private Conta conta;
	private Quarto quarto;
	
	public Reserva() {
		
	}
	
	public Reserva(int codigo, String dataEntrada, String dataSaida, String status, Conta conta, Quarto quarto) {
		this.codigo = codigo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.status = status;
		this.conta = conta;
		this.quarto = quarto;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
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
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
}