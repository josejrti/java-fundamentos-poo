package app;

public class Funcionario {
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String cargo;
	private double salario;
	
	public Funcionario() {
//		Construtor vazio
	}
	
	public Funcionario(int id, String nome, String telefone, String email, String cargo, double salario) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cargo = cargo;
		this.salario = salario;
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
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome + " - Telefone: " + telefone);
		System.out.println("Email: " + email + " - Cargo: " + cargo + " - Salário: R$ " + salario);
	}
	
}
