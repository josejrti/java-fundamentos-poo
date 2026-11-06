package ifpe;

public class Main {
	public static void main(String[] args) {

		Biblioteca bibliotecaCentral = new Biblioteca("Biblioteca Central");
		
		Autor autor1 = new Autor("José Júnior", "Brasileiro");
		
		Livro livro1 = new Livro(1,"Java Avançado", autor1);
		Livro livro2 = new Livro(2,"CSS Avançado", autor1);
		
		Leitor leitor1 = new Leitor("Juca Santos", "331.321.456.677");
		Leitor leitor2 = new Leitor("Fernando Hugo", "222.311.457.889");
		
		Emprestimo emprestimo1 = new Emprestimo(26, livro1, leitor1, "01/04/2026");
		Emprestimo emprestimo2 = new Emprestimo(27, livro2, leitor2, "01/04/2026");
		
		bibliotecaCentral.getListaLivros().add(livro1);
		bibliotecaCentral.getListaLivros().add(livro2);
		
		bibliotecaCentral.getListaLeitores().add(leitor1);
		bibliotecaCentral.getListaLeitores().add(leitor2);
		
		bibliotecaCentral.getListaEmprestimos().add(emprestimo1);
		bibliotecaCentral.getListaEmprestimos().add(emprestimo2);
		
		autor1.getListaLivros().add(livro1);
		autor1.getListaLivros().add(livro2);
		
		leitor1.getListaEmprestimos().add(emprestimo1);
		leitor2.getListaEmprestimos().add(emprestimo2);
		
		
		System.out.println("==========" + " | Informações " + bibliotecaCentral.getNome() + " | ==========");
		System.out.println("\n\n===== Livros:");
		for (Livro livro : bibliotecaCentral.getListaLivros()) {
			System.out.println("\nTítulo: " + livro.getTitulo() + " - Autor: " + livro.getAutor().getNome());
		}
		System.out.println("\n\n=== Empréstimos:");
		for(Emprestimo emprestimo : bibliotecaCentral.getListaEmprestimos()) {
			System.out.println("\nLivro: " + emprestimo.getLivro().getTitulo());
			System.out.println("Leitor: " + emprestimo.getLeitor().getNome() + " - Data: " + emprestimo.getData());
		}
	}
}
