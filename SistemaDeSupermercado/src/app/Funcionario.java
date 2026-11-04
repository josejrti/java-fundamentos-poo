package app;

public class Funcionario {
	private int id;
	private String nome;
	private String telefone;
	private String funcao;
	
	public Funcionario() {
//		Construtor vazio
	}
	
	public Funcionario(int id, String nome, String telefone, String funcao) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.funcao = funcao;
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
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome);
		System.out.println("Telefone: " + telefone + " - Função: " + funcao);
	}
}
