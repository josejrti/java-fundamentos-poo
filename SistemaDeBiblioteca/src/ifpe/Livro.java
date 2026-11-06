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
	
	public int getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
	
}
