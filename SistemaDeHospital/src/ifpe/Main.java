package ifpe;

public class Main {
	public static void main(String[] args) {
		Hospital hospitalCentral = new Hospital("Hospital Central");
		Medico medico1 = new Medico("Dr. Mario Jorge", "KMIOR581D32", "Cardiologista");
		Medico medico2 = new Medico("Dr. Gabriel Barcellar", "KMN12345JNA", "Clinico Geral");
		Medico medico3 = new Medico("Dr. Fernando Lima", "KYR2345JNB8", "Cirurgião Dentista");
		Paciente paciente1 = new Paciente("Hugo Lima", "821.231.231.132");
		Paciente paciente2 = new Paciente("Maria Ana", "452.123.231.456");
		Paciente paciente3 = new Paciente("Carol Fernanda", "456.121.321.321");
		Consulta consulta1 = new Consulta(44, "01/04/2026", paciente1, medico1);
		Consulta consulta2 = new Consulta(45, "01/04/2026", paciente2, medico3);
		Consulta consulta3 = new Consulta(46, "01/04/2026", paciente3, medico2);
		Consulta consulta4 = new Consulta(47, "01/04/2026", paciente2, medico2);
		
		hospitalCentral.adicionarMedico(medico1);
		hospitalCentral.adicionarMedico(medico2);
		hospitalCentral.adicionarMedico(medico3);
		hospitalCentral.adicionarPaciente(paciente1);
		hospitalCentral.adicionarPaciente(paciente2);
		hospitalCentral.adicionarPaciente(paciente3);
		hospitalCentral.adicionarConsulta(consulta1);
		hospitalCentral.adicionarConsulta(consulta2);
		hospitalCentral.adicionarConsulta(consulta3);
		hospitalCentral.adicionarConsulta(consulta4);
		
		paciente1.adicionarConsulta(consulta1);
		paciente2.adicionarConsulta(consulta2);
		paciente2.adicionarConsulta(consulta4);
		paciente3.adicionarConsulta(consulta3);
		
		medico1.adicionarConsulta(consulta1);
		medico2.adicionarConsulta(consulta3);
		medico2.adicionarConsulta(consulta4);
		medico3.adicionarConsulta(consulta2);

		hospitalCentral.exibirDados();
	}
}
