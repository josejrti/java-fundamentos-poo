package app;
import java.util.ArrayList;

public class Andar {
	private int numero;
	private String descricao;
	private int qtdQuartos;
	private ArrayList<Quarto> listaQuartos = new ArrayList<>();
	
	public Andar() {
	}
	
	public Andar(int numero, String descricao, int qtdQuartos) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtdQuartos = qtdQuartos;
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
	
	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	
	public int getQtdQuartos() {
		return qtdQuartos;
	}
	
	public ArrayList<Quarto> getListaQuartos(){
		return listaQuartos;
	}
}