package app;

public class Quarto {
	private int numero;
	private String tipo;
	private int capacidade;
	private double valorDiaria;
	private String status;
	
	public Quarto() {
		
	}
	
	public Quarto(int numero, String tipo, int capacidade, double valorDiaria, String status) {
		this.numero = numero;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.valorDiaria = valorDiaria;
		this.status = status;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public double getValorDiaria() {
		return valorDiaria;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
}