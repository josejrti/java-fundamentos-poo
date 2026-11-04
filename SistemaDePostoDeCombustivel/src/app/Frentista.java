package app;

public class Frentista extends Funcionario{
	private Bomba bomba;
	
	public Frentista() {
//		Construtor vazio
	}
	
	public Frentista(Bomba bomba, int id, String nome, String telefone, Servico servico) {
		super(id, nome, telefone, servico);
		this.bomba = bomba;
	}

	public void exibirDados() {
		System.out.println("ID: " + getId() + " - Nome: " + getNome());
		System.out.println("Bomba: " + bomba.getId() + " - Telefone: " + getTelefone());
	}	
}