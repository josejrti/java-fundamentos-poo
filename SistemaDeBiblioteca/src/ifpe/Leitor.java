package ifpe;
import java.util.ArrayList;

public class Leitor {
	private String nome;
	private String cpf;
	private ArrayList<Emprestimo> listaEmprestimos;
	
	public Leitor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.listaEmprestimos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarEmprestimo(Emprestimo emprestimo) {
		this.listaEmprestimos.add(emprestimo);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " | CPF: " + cpf);
	}
}
