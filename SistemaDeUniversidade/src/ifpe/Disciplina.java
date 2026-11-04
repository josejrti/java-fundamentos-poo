package ifpe;

public class Disciplina {
	private	String nome;
	private String codigo;
	private Professor professor;
	private Curso curso;
	
	public Disciplina(String nome, String codigo, Professor professor, Curso curso) {
		this.nome = nome;
		this.codigo = codigo;
		this.professor = professor;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " Código: " + codigo);
		System.out.println("Professor: " + professor.getNome() + " Curso: " + curso.getNome());
	}
}
