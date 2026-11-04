package ifpe;
import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String matricula;
	private ArrayList<Matricula> listaMatriculas;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.listaMatriculas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarMatricula(Matricula matricula) {
		this.listaMatriculas.add(matricula);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " Matricula: " + matricula);
	}
}
