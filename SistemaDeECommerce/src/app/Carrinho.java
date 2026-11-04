package app;
import java.util.ArrayList;

public class Carrinho {
	private int id;
	private Cliente cliente;
	private double valorFinal;
	private ArrayList<Produto> listaProdutos;
	
	public Carrinho() {
//		Construtor vazio
	}
	
	public Carrinho(int id, Cliente cliente, double valorFinal) {
		this.id = id;
		this.cliente = cliente;
		this.valorFinal = valorFinal;
		this.listaProdutos = new ArrayList<>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public double getValorFinal() {
		return valorFinal;
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
		System.out.println("ID: " + id + " - Cliente: " + cliente.getNome());
		System.out.println("Valor final do Carrinho: R$ " + valorFinal);
		System.out.println("\n--- Produtos neste Carrinho:");
		for(Produto produto : listaProdutos) {
			System.out.println();
			produto.exibirDados();
		}
	}
	
}
