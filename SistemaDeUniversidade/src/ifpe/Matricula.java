package ifpe;
import java.util.ArrayList;

public class Matricula {
	private int id;
	private Aluno aluno;
	private Disciplina disciplina;
	private ArrayList<Avaliacao> listaAvaliacoes;
	
	public Matricula(int id, Aluno aluno, Disciplina disciplina) {
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.listaAvaliacoes = new ArrayList<>();
	}

	public void adicionarAvaliacao(Avaliacao avaliacao) {
		this.listaAvaliacoes.add(avaliacao);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " Aluno: " + aluno.getNome() + " Disciplina: " + disciplina.getNome());
		System.out.println("Avaliações: ");
		for(Avaliacao avaliacao : listaAvaliacoes) {
			avaliacao.exibirDados();
		}
	}
}
