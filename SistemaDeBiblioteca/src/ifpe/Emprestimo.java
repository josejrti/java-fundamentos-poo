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
	
	public void exibirDados() {
		System.out.println("ID do empréstimo: " + numeroId + " | Livro: " + livro.getTitulo());
		System.out.println("Leitor: " + leitor.getNome() + " | Data: " + data);
	}
}
