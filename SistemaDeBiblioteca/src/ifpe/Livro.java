package ifpe;

public class Livro {
	private int numeroId;
	private String titulo;
	private Autor autor;
	
	public Livro(int numeroId, String titulo, Autor autor) {
		this.numeroId = numeroId;
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void exibirDados() {
		System.out.println("ID do livro: " + numeroId + " | Título: " + titulo);
		System.out.println("-- Autor:");
		autor.exibirDados();
	}
}
