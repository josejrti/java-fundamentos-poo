package app;
import java.util.ArrayList;

public class Posto {
	private int id;
	private String nome;
	private String endereco;
	private ArrayList<Servico> listaServicos;
	private ArrayList<Funcionario> listaFuncionarios;
	private ArrayList<Bomba> listaBombas;
	private ArrayList<Frentista> listaFrentistas;
	
	public Posto() {
//		Construtor vazio
	}
	
	public Posto(int id, String nome, String endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.listaServicos = new ArrayList<>();
		this.listaFuncionarios = new ArrayList<>();
		this.listaBombas = new ArrayList<>();
		this.listaFrentistas = new ArrayList<>();
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
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setListaServicos(ArrayList<Servico> listaServicos) {
		this.listaServicos = listaServicos;
	}
	
	public ArrayList<Servico> getListaServicos(){
		return listaServicos;
	}
	
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public ArrayList<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public void setListaBombas(ArrayList<Bomba> listaBombas) {
		this.listaBombas = listaBombas;
	}
	
	public ArrayList<Bomba> getListaBombas(){
		return listaBombas;
	}
	
	public void setListaFrentistas(ArrayList<Frentista> listaFrentistas) {
		this.listaFrentistas = listaFrentistas;
	}
	
	public ArrayList<Frentista> getListaFrentistas(){
		return listaFrentistas;
	}
	
	public void addServico(Servico servico) {
		this.listaServicos.add(servico);
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.listaFuncionarios.add(funcionario);
	}
	
	public void addBomba(Bomba bomba) {
		this.listaBombas.add(bomba);
	}
	
	public void addFrentista(Frentista frentista) {
		this.listaFrentistas.add(frentista);
	}
	
	public void exibirDados() {
		System.out.println("\nID: " + id + " - Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("\n----- Lista de serviços:");
		for(Servico servico : listaServicos) {
			System.out.println();
			servico.exibirDados();
		}
		System.out.println("\n----- Lista de Funcionários:");
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println();
			funcionario.exibirDados();
		}
		System.out.println("\n----- Lista de Bombas:");
		for(Bomba bomba : listaBombas) {
			System.out.println();
			bomba.exibirDados();
		}
		System.out.println("\n----- Lista de Frentistas:");
		for(Frentista frentista : listaFrentistas) {
			System.out.println();
			frentista.exibirDados();
		}
	}
}
