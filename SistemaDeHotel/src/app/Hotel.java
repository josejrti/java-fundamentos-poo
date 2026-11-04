package app;
import java.util.ArrayList;

public class Hotel {
	private int id;
	private String nome;
	private String endereco;
	private ArrayList<Andar> listaAndares;
	
	public Hotel() {
//		Construtor vazio
	}
	
	public Hotel(int id, String nome, String endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.listaAndares = new ArrayList<>();
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
	
	public void setListaAndares(ArrayList<Andar> listaAndares) {
		this.listaAndares = listaAndares;
	}
	
	public ArrayList<Andar> getListaAndares(){
		return listaAndares;
	}
	
	public void addAndar(Andar andar) {
		this.listaAndares.add(andar);
	}
	
	public void exibirDados() {
		System.out.println("\nID: " + id + " - Nome: " + nome + " - Endereço: " + endereco);
		System.out.println("\n--- Andares do hotel:");
		for(Andar andar : listaAndares) {
			System.out.println();
			andar.exibirDados();
		}
	}
}
