package ifpe;
import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> listaLivros;
	private ArrayList<Leitor> listaLeitores;
	private ArrayList<Emprestimo> listaEmprestimos;
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.listaLivros = new ArrayList<>();
		this.listaLeitores = new ArrayList<>();
		this.listaEmprestimos = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		this.listaLivros.add(livro);
	}
	
	public void adicionarLeitor(Leitor leitor) {
		this.listaLeitores.add(leitor);
	}
	
	public void adicionarEmprestimo(Emprestimo emprestimo) {
		this.listaEmprestimos.add(emprestimo);
	}
	
	public void exibirDados() {
		System.out.println("===== Biblioteca: " + nome + " =====\n");
		System.out.println("Lista de livros:\n");
		for(Livro livro : listaLivros) {
			System.out.println("---------------------------------------------");
			livro.exibirDados();
			System.out.println("---------------------------------------------");
		}
		System.out.println("\nLista de Leitores:\n");
		for(Leitor leitor : listaLeitores) {
			System.out.println("---------------------------------------------");
			leitor.exibirDados();
			System.out.println("---------------------------------------------");
		}
		System.out.println("\nLista de Empréstimos:\n");
		for(Emprestimo emprestimo : listaEmprestimos) {
			System.out.println("---------------------------------------------");
			emprestimo.exibirDados();
			System.out.println("---------------------------------------------");
		}
	}
}
