package app;
import java.util.ArrayList;

public class Bomba {
	private int id;
	private double capacidade;
	private ArrayList<Frentista> listaFrentistas;
	
	public Bomba() {
//		Construtor vazio
	}
	
	public Bomba(int id, double capacidade) {
		this.id = id;
		this.capacidade = capacidade;
		this.listaFrentistas = new ArrayList<>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	
	public void setListaFrentistas(ArrayList<Frentista> listaFrentistas) {
		this.listaFrentistas = listaFrentistas;
	}
	
	public ArrayList<Frentista> getListaFrentistas(){
		return listaFrentistas;
	}
	
	public void addFrentista(Frentista frentista) {
		this.listaFrentistas.add(frentista);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Capacidade: " + capacidade + " Litros");
		System.out.println("\n--- Frentistas desta Bomba:");
		for(Frentista frentista : listaFrentistas) {		
			System.out.println();
			System.out.println(frentista.getNome());
		}
	}
}
