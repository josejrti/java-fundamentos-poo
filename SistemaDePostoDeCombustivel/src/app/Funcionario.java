package app;

public class Funcionario {
	private int id;
	private String nome;
	private String telefone;
	private Servico servico;
	
	public Funcionario() {
//		Construtor vazio
	}

	public Funcionario(int id, String nome, String telefone, Servico servico) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.servico = servico;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome);
		System.out.println("Telefone: " + telefone + " - Serviço: " + servico.getNome());
	}
}
