package ifpe;

import java.util.ArrayList;

public class Autor extends Pessoa{
	private String nacionalidade;
	private ArrayList<Livro> listaLivros = new ArrayList<>();
	
	public Autor(String nome, String nacionalidade) {
		super(nome);
		this.nacionalidade = nacionalidade;
	}
	
	public Autor() {};

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(ArrayList<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

	// Método de teste
	@Override 
	public void falar() {
		System.out.println("Teste");
	}
	
}
