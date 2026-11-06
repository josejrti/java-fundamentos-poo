package ifpe;
import java.util.ArrayList;

public class Leitor extends Pessoa{
	private String cpf;
	private ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();
	
	public Leitor(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	public Leitor() {};
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Emprestimo> getListaEmprestimos() {
		return listaEmprestimos;
	}

	public void setListaEmprestimos(ArrayList<Emprestimo> listaEmprestimos) {
		this.listaEmprestimos = listaEmprestimos;
	}

	// Método de teste
	@Override
	public void falar() {
		System.out.println("Teste");
	}
	
}
