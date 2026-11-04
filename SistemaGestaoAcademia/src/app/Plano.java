package app;

public class Plano {
	private String nome;
	private double valorMensal;
	private int duracao;
	
	public Plano() {
//		Construtor vazio
	}
	
	public Plano(String nome, double valorMensal, int duracao) {
		this.nome = nome;
		this.valorMensal = valorMensal;
		this.duracao = duracao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	
	public double getValorMensal() {
		return valorMensal;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " - Valor Mensal: " + valorMensal +
				" - Duração: " + duracao + " Meses");
	}
}
