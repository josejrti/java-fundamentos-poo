package ifpe;

public class Professor {
	private int numeroId;
	private String nome;
	private String disciplina;
	
	public Professor(int numeroId, String nome, String disciplina) {
		this.numeroId = numeroId;
		this.nome = nome;
		this.disciplina = disciplina;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + numeroId + " | Nome: " + nome);
		System.out.println("Disciplina: " + disciplina);
	}
}
