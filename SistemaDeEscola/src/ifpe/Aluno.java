package ifpe;
import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String codigoMatricula;
	private ArrayList<Matricula> listaMatriculas;
	
	public Aluno(String nome, String codigoMatricula) {
		this.nome = nome;
		this.codigoMatricula = codigoMatricula;
		this.listaMatriculas = new ArrayList<>();
	}	
	
	public void adicionarMatricula(Matricula matricula) {
		this.listaMatriculas.add(matricula);
	}
	
	public void exibirDados() {
		System.out.println("   Aluno: " + nome + " | Código Matricula: " + codigoMatricula);
	}
}
