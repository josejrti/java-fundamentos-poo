package ifpe;
import java.util.ArrayList;

public class Universidade {
	private String nome;
	private ArrayList<Curso> listaCursos;
	private ArrayList<Professor> listaProfessores;
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Matricula> listaMatriculas;
	
	public Universidade(String nome) {
		this.nome = nome;
		this.listaCursos = new ArrayList<>();
		this.listaProfessores = new ArrayList<>();
		this.listaAlunos = new ArrayList<>();
		this.listaMatriculas = new ArrayList<>();
	}
	
	public void addCurso(Curso curso) {
		this.listaCursos.add(curso);
	}
	
	public void addProfessor(Professor professor) {
		this.listaProfessores.add(professor);
	}
	
	public void addAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public void addMatricula(Matricula matricula) {
		this.listaMatriculas.add(matricula);
	}
	
	public void exibirDados() {
		System.out.println("----- Universidade: " + nome + " -----");
		System.out.println("\nLista de cursos:\n");
		for(Curso curso : listaCursos) {
			curso.exibirDados();
		}
		System.out.println("\nLista de professores:\n");
		for(Professor professor : listaProfessores) {
			professor.exibirDados();
		}
		System.out.println("\nLista de matriculas:\n");
		for(Matricula matricula : listaMatriculas) {
			matricula.exibirDados();
		}
	}
}
