package ifpe;

public class Avaliacao {
	private int id;
	private String descricao;
	private float nota;
	
	public Avaliacao(int id, String descricao, float nota) {
		this.id = id;
		this.descricao = descricao;
		this.nota = nota;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " Descrição: " + descricao + " Nota: " + nota);
	}
}
