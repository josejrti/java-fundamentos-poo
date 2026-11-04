package ifpe;
import java.util.ArrayList;

public class Hospital {
	private String nome;
	private ArrayList<Medico> listaMedicos;
	private ArrayList<Paciente> listaPacientes;
	private ArrayList<Consulta> listaConsultas;
	
	public Hospital(String nome) {
		this.nome = nome;
		this.listaMedicos = new ArrayList<>();
		this.listaPacientes = new ArrayList<>();
		this.listaConsultas = new ArrayList<>();
	}
	
	public void adicionarMedico(Medico medico) {
		this.listaMedicos.add(medico);
	}
	
	public void adicionarPaciente(Paciente paciente) {
		this.listaPacientes.add(paciente);
	}
	
	public void adicionarConsulta(Consulta consulta) {
		this.listaConsultas.add(consulta);
	}
	
	public void exibirDados() {
		System.out.println("========== Hospital: " + nome + " ==========");
		System.out.println("\nLista De Médicos:\n");
		for(Medico medico : listaMedicos) {
			System.out.println("----------------------------------------------");
			medico.exibirDados();
			System.out.println("----------------------------------------------");
		}
		System.out.println("\nLista De Consultas:\n");
		for(Consulta consulta : listaConsultas) {
			System.out.println("----------------------------------------------");
			consulta.exibirDados();
			System.out.println("----------------------------------------------");
		}
	}
}
