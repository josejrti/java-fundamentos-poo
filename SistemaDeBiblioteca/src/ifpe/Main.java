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
		
		bibliotecaCentral.adicionarLivro(livro1);
		bibliotecaCentral.adicionarLivro(livro2);
		bibliotecaCentral.adicionarLeitor(leitor1);
		bibliotecaCentral.adicionarLeitor(leitor2);
		bibliotecaCentral.adicionarEmprestimo(emprestimo1);
		bibliotecaCentral.adicionarEmprestimo(emprestimo2);
	
		leitor1.adicionarEmprestimo(emprestimo1);
		leitor2.adicionarEmprestimo(emprestimo2);
		
		bibliotecaCentral.exibirDados();
	}
}
