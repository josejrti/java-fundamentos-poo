package ifpe;

public class Emprestimo {
	private int numeroId;
	private Livro livro;
	private Leitor leitor;
	private String data;
	
	public Emprestimo(int numeroId, Livro livro, Leitor leitor, String data) {
		this.numeroId = numeroId;
		this.livro = livro;
		this.leitor = leitor;
		this.data = data;
	}

	public int getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
