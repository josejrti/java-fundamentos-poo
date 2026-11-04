package app;
import java.util.ArrayList;

public class Hotel {
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private ArrayList<Andar> listaAndares = new ArrayList<>();
	
	public Hotel() {
	}
	
	public Hotel(int id, String nome, String endereco, String telefone) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
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
	
	public void setListaAndares(ArrayList<Andar> listaAndares) {
		this.listaAndares = listaAndares;
	}
	
	public ArrayList<Andar> getListaAndares(){
		return listaAndares;
	}
	
}
