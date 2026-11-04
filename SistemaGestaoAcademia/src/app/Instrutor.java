package app;
import java.util.ArrayList;

public class Instrutor {
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String especialidade;
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Treino> listaTreinos;
	
	public Instrutor() {
//		Construtor vazio
	}
	
	public Instrutor(int id, String nome, String telefone, String email, String especialidade) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.especialidade = especialidade;
		this.listaAlunos = new ArrayList<>();
		this.listaTreinos = new ArrayList<>();
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
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
	public ArrayList<Aluno> getListaAlunos(){
		return listaAlunos;
	}
	
	public void setListaTreinos(ArrayList<Treino> listaTreinos) {
		this.listaTreinos = listaTreinos;
	}
	
	public ArrayList<Treino> getListaTreinos(){
		return listaTreinos;
	}
	
	public void addAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public void addTreino(Treino treino) {
		this.listaTreinos.add(treino);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome + " - Telefone: " + telefone);
		System.out.println("Email: " + email + " - Especialidade: " + especialidade);
		System.out.println("\n--- Alunos do Instrutor:");
		for(Aluno aluno : listaAlunos) {
			System.out.println();
			System.out.println("Nome: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
		}
		System.out.println("\n--- Treinos do instrutor:");
		for(Treino treino : listaTreinos) {
			System.out.println();
			System.out.println("Descrição: " + treino.getDescricao() + " - Nivel: " + treino.getNivel());
			System.out.println("Aluno neste treino: " + treino.getAluno().getNome());
		}
	}
}
