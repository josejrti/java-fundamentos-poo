package app;

public class Pagamento {
	private double valor;
	private String data;
	private String status;
	private Aluno aluno;
	
	public Pagamento() {
//		Construtor vazio
	}
	
	public Pagamento(double valor, String data, String status, Aluno aluno) {
		this.valor = valor;
		this.data = data;
		this.status = status;
		this.aluno = aluno;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void exibirDados() {
		System.out.println("Valor: R$ " + valor + " - Data: " + data);
		System.out.println("Status: " + status + " - Aluno: " + aluno.getNome());
	}
}
