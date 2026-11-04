package app;
import java.util.ArrayList;

public class Caminhao {
	private int id;
	private String marca;
	private String modelo;
	private String placa;
	private double capacidade;
	private ArrayList<Funcionario> listaFuncionarios;
	
	
	public Caminhao() {
//		Construtor vazio
	}
	
	public Caminhao(int id, String marca, String modelo, String placa, double capacidade) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.capacidade = capacidade;
		this.listaFuncionarios = new ArrayList<>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public ArrayList<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.listaFuncionarios.add(funcionario);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Marca: " + marca + " - Modelo: " + modelo);
		System.out.println("Placa: " + placa + " - Capacidade: " + capacidade + " Toneladas");
		System.out.println("\n--- Funcionários deste Caminhão:");
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println();
			System.out.println("Nome: " + funcionario.getNome() + " - Função: " + funcionario.getFuncao());
		}
	}
}
