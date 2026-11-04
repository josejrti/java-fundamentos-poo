package app;

public class Quarto {
	private int numero;
	private int qtdPessoas;
	private double valorDiaria;
	private String status;
	
	public Quarto() {
//		Construtor vazio
	}
	
	public Quarto(int numero, int qtdPessoas, double valorDiaria, String status) {
		this.numero = numero;
		this.qtdPessoas = qtdPessoas;
		this.valorDiaria = valorDiaria;
		this.status = status;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	public int getQtdPessoas() {
		return qtdPessoas;
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
	
	public void exibirDados() {
		System.out.println("Número: " + numero + " - Quantidade de pessoas: " + qtdPessoas);
		System.out.println("Valor diária: R$ " + valorDiaria + " - Status: " + status);
	}
}
