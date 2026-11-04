package ifpe;

public class Professor {
	private String nome;
	private String matricula;
	
	public Professor(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " Matricula: " + matricula);
	}
}
