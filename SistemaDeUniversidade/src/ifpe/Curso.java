package ifpe;
import java.util.ArrayList;

public class Curso {
	private String nome;
	private String codigo;
	private ArrayList<Disciplina> listaDisciplinas;
	
	public Curso(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
		this.listaDisciplinas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public void adicionarDisciplina(Disciplina disciplina) {
		this.listaDisciplinas.add(disciplina);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " Código: " + codigo);
		System.out.println("Disciplinas do curso: ");
		for(Disciplina disciplina : listaDisciplinas) {
			System.out.println(disciplina.getNome());
		}
	}
}
