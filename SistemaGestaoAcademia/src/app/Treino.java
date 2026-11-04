package app;

public class Treino {
	private String descricao;
	private String nivel;
	private Aluno aluno;
	private Instrutor instrutor;
	
	public Treino() {
//		Construtor vazio
	}
	
	public Treino(String descricao, String nivel, Aluno aluno, Instrutor instrutor) {
		this.descricao = descricao;
		this.nivel = nivel;
		this.aluno = aluno;
		this.instrutor = instrutor;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	public String getNivel() {
		return nivel;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	public Instrutor getInstrutor() {
		return instrutor;
	}
	
	public void exibirDados() {
		System.out.println("Descrição: " + descricao + " - Nível: " + nivel);
		System.out.println("Aluno: " + aluno.getNome() + " - Instrutor: " + instrutor.getNome());
	}
}
