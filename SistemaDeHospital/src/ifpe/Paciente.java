package ifpe;
import java.util.ArrayList;

public class Paciente {
	private String nome;
	private String cpf;
	private ArrayList<Consulta> listaConsultas;
	
	public Paciente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.listaConsultas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarConsulta(Consulta consulta) {
		this.listaConsultas.add(consulta);
	}
	
	public void exibirDados() {
		System.out.println("   Paciente: " + nome + " | Cpf: " + cpf);
	}
}
