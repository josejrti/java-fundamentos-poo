package app;
import java.util.ArrayList;

public class Supermercado {
	private int id;
	private String nome;
	private String endereco;
	private ArrayList<Produto> listaProdutos;
	private ArrayList<Funcionario> listaFuncionarios;
	private ArrayList<Caixa> listaCaixas;
	private ArrayList<Caminhao> listaCaminhoes;
	
	public Supermercado() {
//		Construtor vazio
	}
	
	public Supermercado(int id, String nome, String endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.listaProdutos = new ArrayList<>();
		this.listaFuncionarios = new ArrayList<>();
		this.listaCaixas = new ArrayList<>();
		this.listaCaminhoes = new ArrayList<>();
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
	
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public ArrayList<Produto> getListaProdutos(){
		return listaProdutos;
	}
	
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public ArrayList<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public void setListaCaixas(ArrayList<Caixa> listaCaixas) {
		this.listaCaixas = listaCaixas;
	}
	
	public ArrayList<Caixa> getListaCaixas(){
		return listaCaixas;
	}
	
	public void setListaCaminhoes(ArrayList<Caminhao> listaCaminhoes) {
		this.listaCaminhoes = listaCaminhoes;
	}
	
	public ArrayList<Caminhao> getListaCaminhoes(){
		return listaCaminhoes;
	}
	
	public void addProduto(Produto produto) {
		this.listaProdutos.add(produto);
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.listaFuncionarios.add(funcionario);
	}
	
	public void addCaixa(Caixa caixa) {
		this.listaCaixas.add(caixa);
	}
	
	public void addCaminhao(Caminhao caminhao) {
		this.listaCaminhoes.add(caminhao);
	}
	
	public void exibirDados() {
		System.out.println("\nID: " + id + " - Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("\n----- Lista de produtos:");
		for(Produto produto : listaProdutos) {
			System.out.println();
			produto.exibirDados();
		}
		System.out.println("\n----- Lista de funcionários:");
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println();
			funcionario.exibirDados();
		}
		System.out.println("\n----- Lista de Caixas:");
		for(Caixa caixa : listaCaixas) {
			System.out.println();
			caixa.exibirDados();
		}
		System.out.println("\n----- Lista de Caminhões:");
		for(Caminhao caminhao : listaCaminhoes) {
			System.out.println();
			caminhao.exibirDados();
		}
	}
}
