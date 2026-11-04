package app;
import java.util.ArrayList;

public class Academia {
	private String nome;
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Instrutor> listaInstrutores;
	private ArrayList<Funcionario> listaFuncionarios;
	private ArrayList<Plano> listaPlanos;
	
	public Academia() {
//		Construtor vazio
	}
	
	public Academia(String nome) {
		this.nome = nome;
		this.listaAlunos = new ArrayList<>();
		this.listaInstrutores = new ArrayList<>();
		this.listaFuncionarios = new ArrayList<>();
		this.listaPlanos = new ArrayList<>();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
	public ArrayList<Aluno> getListaAlunos(){
		return listaAlunos;
	}
	
	public void setListaInstrutores(ArrayList<Instrutor> listaInstrutores) {
		this.listaInstrutores = listaInstrutores;
	}
	
	public ArrayList<Instrutor> getListaInstrutores(){
		return listaInstrutores;
	}
	
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public ArrayList<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public void setListaPlanos(ArrayList<Plano> listaPlanos) {
		this.listaPlanos = listaPlanos;
	}
	
	public ArrayList<Plano> getListaPlanos(){
		return listaPlanos;
	}
	
	public void addAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public void addInstrutor(Instrutor instrutor) {
		this.listaInstrutores.add(instrutor);
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.listaFuncionarios.add(funcionario);
	}
	
	public void addPlano(Plano plano) {
		this.listaPlanos.add(plano);
	}
	
	public void exibirDados() {
		System.out.println("\nNome: " + nome);
		System.out.println("\n----- Alunos Cadastrados:");
		for(Aluno aluno : listaAlunos) {
			System.out.println();
			aluno.exibirDados();
		}
		System.out.println("\n----- Lista de Instrutores:");
		for(Instrutor instrutor : listaInstrutores) {
			System.out.println();
			instrutor.exibirDados();
		}
		System.out.println("\n----- Lista de Funcionários:");
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println("");
			funcionario.exibirDados();
		}
		System.out.println("\n----- Lista de Planos:");
		for(Plano plano : listaPlanos) {
			System.out.println();
			plano.exibirDados();
		}
	}
}
