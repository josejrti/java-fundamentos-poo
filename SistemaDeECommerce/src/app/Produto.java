package app;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private String modelo;
	private Marca marca;
	private String cor;
	private double valor;
	private Categoria categoria;
	private Cliente cliente;
	
	public Produto() {
//		Construtor vazio
	}
	
	public Produto(int id, String nome, String descricao, String modelo, Marca marca, String cor, double valor, Categoria categoria, Cliente cliente) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.valor = valor;
		this.categoria = categoria;
		this.cliente = cliente;
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
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome + " - Marca: " + marca.getNome());
		System.out.println("Descrição: " + descricao + " - Valor: R$ " + valor);
		System.out.println("Cor: " + cor + " - Modelo: " + modelo);
	}
}
