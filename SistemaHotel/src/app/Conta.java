package app;

public class Conta {
	private int numeroConta;
	private double valorTotal;
	private String statusPagamento;
	
	public Conta() {
		
	}
	
	public Conta(int numeroConta, double valorTotal, String statusPagamento) {
		this.numeroConta = numeroConta;
		this.valorTotal = valorTotal;
		this.statusPagamento = statusPagamento;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public int getNumeroConta() {
		return numeroConta;
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
}