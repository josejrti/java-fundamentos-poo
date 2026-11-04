package ifpe;

public class Consulta {
	private int numeroId;
	private String data;
	private Paciente paciente;
	private Medico medico;
	
	public Consulta(int numeroId, String data, Paciente paciente, Medico medico) {
		this.numeroId = numeroId;
		this.data = data;
		this.paciente = paciente;
		this.medico = medico;
	}
	
	public void exibirDados() {
		System.out.println("ID da consulta: " + numeroId + " | Data: " + data);
		paciente.exibirDados();
		System.out.println("   Médico: " + medico.getNome() + " | " + medico.getEspecialidade());
	}
}
