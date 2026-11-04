package app;
import java.util.ArrayList;

public class Andar {
	private int numero;
	private String descricao;
	private int totalQuartos;
	private ArrayList<Quarto> listaQuartos;
	
	public Andar() {
//		Construtor vazio
	}
	
	public Andar(int numero, String descricao, int totalQuartos) {
		this.numero = numero;
		this.descricao = descricao;
		this.totalQuartos = totalQuartos;
		this.listaQuartos = new ArrayList<>();
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setTotalQuartos(int totalQuartos) {
		this.totalQuartos = totalQuartos;
	}
	
	public int getTotalQuartos() {
		return totalQuartos;
	}
	
	public void setListaQuartos(ArrayList<Quarto> listaQuartos) {
		this.listaQuartos = listaQuartos;
	}
	
	public ArrayList<Quarto> getListaQuartos(){
		return listaQuartos;
	}
	
	public void addQuarto(Quarto quarto) {
		this.listaQuartos.add(quarto);
	}
	
	public void exibirDados() {
		System.out.println("Número: " + numero + " - Descrição: " + descricao +
				" - Total de quartos: " + totalQuartos);
		System.out.println("\n- Quartos do andar:");
		for(Quarto quarto : listaQuartos) {
			System.out.println();
			quarto.exibirDados();
		}
	}
}
