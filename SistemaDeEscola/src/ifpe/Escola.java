package ifpe;
import java.util.ArrayList;

public class Escola {
	private String nome;
	private ArrayList<Professor> listaProfessores;
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Disciplina> listaDisciplinas;
	private ArrayList<Matricula> listaMatriculas;
	
	public Escola(String nome) {
		this.nome = nome;
		this.listaProfessores = new ArrayList<>();
		this.listaAlunos = new ArrayList<>();
		this.listaDisciplinas = new ArrayList<>();
		this.listaMatriculas = new ArrayList<>();
	}
	
	public void adicionarProfessor(Professor professor) {
		this.listaProfessores.add(professor);
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public void adicionarDisciplina(Disciplina disciplina) {
		this.listaDisciplinas.add(disciplina);
	}
	
	public void adicionarMatricula(Matricula matricula) {
		this.listaMatriculas.add(matricula);
	}
	
	public void exibirDados() {
		System.out.println("===== Escola: " + nome + " =====");
		System.out.println("\nLista de Professores: \n");
		for(Professor professor : listaProfessores) {
			professor.exibirDados();
		}
		System.out.println("\nLista de Disciplinas: \n");
		for(Disciplina disciplina : listaDisciplinas) {
			disciplina.exibirDados();
		}
		System.out.println("\nLista de Matrículas: \n");
		for(Matricula matricula : listaMatriculas) {
			matricula.exibirDados();
		}
	}
}
