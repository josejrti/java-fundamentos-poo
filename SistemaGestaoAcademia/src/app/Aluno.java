package app;
import java.util.ArrayList;

public class Aluno {
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private String matricula;
	private String dataInscricao;
	private Plano plano;
	private ArrayList<Treino> listaTreinos;
	private ArrayList<Pagamento> listaPagamentos;
	
	public Aluno() {
//		Construtor vazio
	}
	
	public Aluno(int id, String nome, String telefone, String email, String matricula, String dataInscricao, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.matricula = matricula;
		this.dataInscricao = dataInscricao;
		this.plano = plano;
		this.listaTreinos = new ArrayList<>();
		this.listaPagamentos = new ArrayList<>();
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
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setDataInscricao(String dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
	public String getDataInscricao() {
		return dataInscricao;
	}
	
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	public Plano getPlano(){
		return plano;
	}
	
	public void setListaTreinos(ArrayList<Treino> listaTreinos) {
		this.listaTreinos = listaTreinos;
	}
	
	public ArrayList<Treino> getListaTreinos(){
		return listaTreinos;
	}
	
	public void setListaPagamentos(ArrayList<Pagamento> listaPagamentos) {
		this.listaPagamentos = listaPagamentos;
	}
	
	public ArrayList<Pagamento> getListaPagamentos(){
		return listaPagamentos;
	}
	
	public void addTreino(Treino treino) {
		this.listaTreinos.add(treino);
	}
	
	public void addPagamento(Pagamento pagamento) {
		this.listaPagamentos.add(pagamento);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome + " - Telefone: " + telefone);
		System.out.println("Email: " + email + " - Matricula: " + matricula);
		System.out.println("Data de inscrição: " + dataInscricao + " - Plano: " + plano.getNome());
		System.out.println("\n--- Treinos do Aluno: ");
		for(Treino treino : listaTreinos) {
			System.out.println();
			System.out.println("Descrição: " + treino.getDescricao());
		}
		System.out.println("\n--- Pagamentos do Aluno:");
		for(Pagamento pagamento : listaPagamentos) {
			System.out.println();
			pagamento.exibirDados();
		}
	}
}
