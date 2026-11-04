package app;

public class Pessoa {
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	public Pessoa() {
//		Construtor vazio
	}
	
	public Pessoa(int id, String nome, String telefone, String email) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome);
		System.out.println("Telefone: " + telefone + " - Email: " + email);
	}
	
}
