package app;
import java.util.ArrayList;

public class Categoria {
	private int id;
	private String nome;
	private ArrayList<Produto> listaProdutos;
	
	public Categoria() {
//		Construtor vazio
	}
	
	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
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
		System.out.println("ID: " + id + " - Nome: " + nome);
		System.out.println("\n--- Produtos nesta categoria: ");
		for(Produto produto : listaProdutos) {
			System.out.println();
			produto.exibirDados();
		}
	}
}
