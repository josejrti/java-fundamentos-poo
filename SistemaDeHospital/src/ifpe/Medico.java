package ifpe;
import java.util.ArrayList;

public class Medico {
	private String nome;
	private String crm;
	private String especialidade;
	private ArrayList<Consulta> listaConsultas;
	
	public Medico(String nome, String crm, String especialidade) {
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
		this.listaConsultas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void adicionarConsulta(Consulta consulta) {
		this.listaConsultas.add(consulta);
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " | Crm: " + crm);
		System.out.println("Especialidade: " + especialidade);
	}
}
