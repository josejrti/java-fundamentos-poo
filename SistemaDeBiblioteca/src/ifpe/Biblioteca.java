package ifpe;
import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> listaLivros = new ArrayList<>();
	private ArrayList<Leitor> listaLeitores = new ArrayList<>();
	private ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();
	
	public Biblioteca(String nome) {
		this.nome = nome;
	}
	
	public Biblioteca() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(ArrayList<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

	public ArrayList<Leitor> getListaLeitores() {
		return listaLeitores;
	}

	public void setListaLeitores(ArrayList<Leitor> listaLeitores) {
		this.listaLeitores = listaLeitores;
	}

	public ArrayList<Emprestimo> getListaEmprestimos() {
		return listaEmprestimos;
	}

	public void setListaEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
		this.listaEmprestimos = listaEmprestimos;
	};
	
}
