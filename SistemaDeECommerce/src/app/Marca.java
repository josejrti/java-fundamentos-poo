package app;
import java.util.ArrayList;

public class Marca {
	private int id;
	private String nome;
	private String pais;
	private ArrayList<Produto> listaProdutos;
	
	public Marca() {
//		Construtor vazio
	}
	
	public Marca(int id, String nome, String pais) {
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.listaProdutos = new ArrayList<>();
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
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public ArrayList<Produto> getListaProdutos(){
		return listaProdutos;
	}
	
	public void addProduto(Produto produto) {
		this.listaProdutos.add(produto);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome + " - País: " + pais);
	}
}
