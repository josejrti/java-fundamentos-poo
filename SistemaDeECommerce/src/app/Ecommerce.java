package app;
import java.util.ArrayList;

public class Ecommerce {
	private int id;
	private String nome;
	private String dominio;
	private ArrayList<Categoria> listaCategorias;
	private ArrayList<Carrinho> listaCarrinhos;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Marca> listaMarcas;
	
	public Ecommerce() {
//		Construtor vazio
	}
	
	public Ecommerce(int id, String nome, String dominio) {
		this.id = id;
		this.nome = nome;
		this.dominio = dominio;
		this.listaCategorias = new ArrayList<>();
		this.listaCarrinhos = new ArrayList<>();
		this.listaClientes = new ArrayList<>();
		this.listaMarcas = new ArrayList<>();
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
	
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	public String getDominio() {
		return dominio;
	}
	
	public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}
	
	public ArrayList<Categoria> getListaCategorias(){
		return listaCategorias;
	}
	
	public void setListaCarrinhos(ArrayList<Carrinho> listaCarrinhos) {
		this.listaCarrinhos = listaCarrinhos;
	}
	
	public ArrayList<Carrinho> getListaCarrinhos(){
		return listaCarrinhos;
	}
	
	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public ArrayList<Cliente> getListaClientes(){
		return listaClientes;
	}
	
	public void setListaMarcas(ArrayList<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}
	
	public ArrayList<Marca> getListaMarcas(){
		return listaMarcas;
	}
	
	public void addCategoria(Categoria categoria) {
		this.listaCategorias.add(categoria);
	}
	
	public void addCarrinho(Carrinho carrinho) {
		this.listaCarrinhos.add(carrinho);
	}
	
	public void addCliente(Cliente cliente) {
		this.listaClientes.add(cliente);
	}
	
	public void addMarca(Marca marca) {
		this.listaMarcas.add(marca);
	}
	
	public void exibirDados() {
		System.out.println("\nID: " + id + " - Nome: " + nome + " - Dominio: " + dominio);
		System.out.println("\n----- Categorias de Produtos:");
		for(Categoria categoria : listaCategorias) {
			System.out.println();
			categoria.exibirDados();
		}
		System.out.println("\n----- Lista de Carrinhos:");
		for(Carrinho carrinho : listaCarrinhos) {
			System.out.println();
			carrinho.exibirDados();
		}
		System.out.println("\n----- Lista de clientes:");
		for(Cliente cliente : listaClientes) {
			System.out.println();
			cliente.exibirDados();
		}
		System.out.println("\n----- Marcas parceiras:");
		for(Marca marca : listaMarcas) {
			System.out.println();
			marca.exibirDados();
		}
	}
}
