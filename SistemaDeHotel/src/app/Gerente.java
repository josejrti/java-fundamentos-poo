package app;
import java.util.ArrayList;

public class Gerente {
	private int id;
	private String nome;
	private String telefone;
	private ArrayList<Recepcionista> listaRecepcionistas;
	
	public Gerente() {
//		Construtor vazio
	}
	
	public Gerente(int id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.listaRecepcionistas = new ArrayList<>();
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
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setListaRecepcionistas(ArrayList<Recepcionista> listaRecepcionistas) {
		this.listaRecepcionistas = listaRecepcionistas;
	}
	
	public ArrayList<Recepcionista> getListaRecepcionistas(){
		return listaRecepcionistas;
	}
	
	public void addRecepcionista(Recepcionista recepcionista) {
		this.listaRecepcionistas.add(recepcionista);
	}
	
	public void exibirDados() {
		System.out.println("\nID: " + id + " - Nome: " + nome +
				" - Telefone: " + telefone);
		System.out.println("\n--- Recepcionistas que é responsável:");
		for(Recepcionista recepcionista : listaRecepcionistas) {
			System.out.println();
			recepcionista.exibirDados();
		}
	}
	
}
