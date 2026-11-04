package ifpe;

public class Main {
	public static void main(String[] args) {
		Universidade universidadeCentral = new Universidade("Universidade Central");
		Professor professor = new Professor("Augusto José", "PO99");
		Avaliacao avaliacao1 = new Avaliacao(44, "Projeto", 10.5f);
		Avaliacao avaliacao2 = new Avaliacao(45, "Prova", 7);
		Aluno aluno = new Aluno("Sandro Rocha", "AD32");
		Curso curso = new Curso("ADS", "ADS454");
		Disciplina disciplina = new Disciplina("Algoritmo", "AL44", professor, curso);
		Matricula matricula = new Matricula(99, aluno, disciplina);
		
		universidadeCentral.addCurso(curso);
		universidadeCentral.addProfessor(professor);
		universidadeCentral.addAluno(aluno);
		universidadeCentral.addMatricula(matricula);
		
		curso.adicionarDisciplina(disciplina);
		
		aluno.adicionarMatricula(matricula);
		
		matricula.adicionarAvaliacao(avaliacao1);
		matricula.adicionarAvaliacao(avaliacao2);
		
		universidadeCentral.exibirDados();
	}
}
