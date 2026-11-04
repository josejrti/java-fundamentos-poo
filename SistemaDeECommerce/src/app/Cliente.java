package app;
import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private ArrayList<Carrinho> listaCarrinhos;
	
	public Cliente() {
//		Construtor vazio
	}
	
	public Cliente(int id, String nome, String endereco, String telefone, String cpf) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.listaCarrinhos = new ArrayList<>();
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
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setListaCarrinhos(ArrayList<Carrinho> listaCarrinhos) {
		this.listaCarrinhos = listaCarrinhos;
	}
	
	public ArrayList<Carrinho> getListaCarrinhos(){
		return listaCarrinhos;
	}
	
	public void addCarrinho(Carrinho carrinho) {
		this.listaCarrinhos.add(carrinho);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome + " - Endereço: " + endereco);
		System.out.println("Telefone: " + telefone + " - CPF: " + cpf);
	}
}
