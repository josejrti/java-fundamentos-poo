package app;

public class Conta {
	private int numero;
	private double valorTotal;
	private String statusPagamento;
	
	public Conta() {
//		Construtor vazio
	}
	
	public Conta(int numero, double valorTotal, String statusPagamento) {
		this.numero = numero;
		this.valorTotal = valorTotal;
		this.statusPagamento = statusPagamento;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	public String getStatusPagamento() {
		return statusPagamento;
	}
	
	public void exibirDados() {
		System.out.println("\nNúmero: " + numero + " - Valor total: R$ " + valorTotal +
				" - Status: " + statusPagamento);
	}
}
