package ifpe;

public class Matricula {
	private int numeroId;
	private Aluno aluno;
	private Disciplina disciplina;
	
	public Matricula(int numeroId, Aluno aluno, Disciplina disciplina) {
		this.numeroId = numeroId;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + numeroId + " | Disciplina: " + disciplina.getNome());
		aluno.exibirDados();
	}
}
