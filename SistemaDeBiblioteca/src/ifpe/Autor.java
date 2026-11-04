package ifpe;

public class Autor {
	private String nome;
	private String nacionalidade;
	
	public Autor(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " | Nacionalidade: " + nacionalidade);
	}
}
