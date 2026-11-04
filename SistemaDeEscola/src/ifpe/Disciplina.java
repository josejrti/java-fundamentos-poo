package ifpe;

public class Disciplina {
	private String codigoDisciplina;
	private String nome;
	private Professor professor;
	
	public Disciplina(String codigoDisciplina, String nome, Professor professor) {
		this.codigoDisciplina = codigoDisciplina;
		this.nome = nome;
		this.professor = professor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void exibirDados() {
		System.out.println("Código: " + codigoDisciplina + " | Nome: " + nome);
		System.out.println("Professor: " + professor.getNome());
	}
}
