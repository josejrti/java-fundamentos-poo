package app;

public class AppPrincipal {
	public static void main(String[] args) {
		Posto postoCentral = new Posto(55, "Posto Central", "BR 101, Próx: Atacadão, 444.");
		Servico servico1 = new Servico(88, "Borracharia", 24);
		Servico servico2 = new Servico(89, "Calibragem", 24);
		Servico servico3 = new Servico(90, "Alinhamento e Balançeamento", 8);
		Servico servico4 = new Servico(91, "Lanchonete", 24);
		
		Funcionario funcionario1 = new Funcionario(28, "Paulo Santos", "(81) 98233-3131", servico1);
		Funcionario funcionario2 = new Funcionario(29, "Miguel Hugo", "(81) 98411-3361", servico1);
		Funcionario funcionario3 = new Funcionario(30, "Maria José", "(81) 93218-3123", servico4);
		Funcionario funcionario4 = new Funcionario(31, "Farias Santos", "(81) 9415-2131", servico4);
		Funcionario funcionario5 = new Funcionario(32, "Julia Michele", "(81) 94906-1144", servico4);
		Funcionario funcionario6 = new Funcionario(33, "Lucas Marcelo", "(81) 98412-2134", servico2);
		Funcionario funcionario7 = new Funcionario(34, "Julio Silva", "(81) 94512-3214", servico3);
		Funcionario funcionario8 = new Funcionario(35, "Lorival Miguel", "(81) 91567-8123", servico3);
		
		postoCentral.addServico(servico1);
		postoCentral.addServico(servico2);
		postoCentral.addServico(servico3);
		postoCentral.addServico(servico4);
		
		postoCentral.addFuncionario(funcionario1);
		postoCentral.addFuncionario(funcionario2);
		postoCentral.addFuncionario(funcionario3);
		postoCentral.addFuncionario(funcionario4);
		postoCentral.addFuncionario(funcionario5);
		postoCentral.addFuncionario(funcionario6);
		postoCentral.addFuncionario(funcionario7);
		postoCentral.addFuncionario(funcionario8);
		
		servico1.addFuncionario(funcionario1);
		servico1.addFuncionario(funcionario2);
		servico2.addFuncionario(funcionario6);
		servico3.addFuncionario(funcionario8);
		servico3.addFuncionario(funcionario7);
		servico4.addFuncionario(funcionario3);
		servico4.addFuncionario(funcionario4);
		servico4.addFuncionario(funcionario5);
		
		Bomba bomba1 = new Bomba(65, 85.00);
		Bomba bomba2 = new Bomba(66, 85.00);
		Bomba bomba3 = new Bomba(67, 60.00);
		
		Frentista frentista1 = new Frentista(bomba1, 99, "Marcio Bruno", "(81) 98274-3123", servico1);
		Frentista frentista2 = new Frentista(bomba1, 100, "Karlos Miguel", "(81) 98274-3123", servico1);
		Frentista frentista3 = new Frentista(bomba2, 101, "Ciano SIlva", "(81) 99328-4122", servico1);
		Frentista frentista4 = new Frentista(bomba2, 102, "Enderson Miranda", "(81) 9567-3131", servico1);
		Frentista frentista5 = new Frentista(bomba3, 103, "Alexandre Mota", "(81) 93123-1231", servico1);
		Frentista frentista6 = new Frentista(bomba3, 104, "Vitor André", "(81) 96421-09111", servico1);

		postoCentral.addBomba(bomba1);
		postoCentral.addBomba(bomba2);
		postoCentral.addBomba(bomba3);
		
		postoCentral.addFrentista(frentista1);
		postoCentral.addFrentista(frentista2);
		postoCentral.addFrentista(frentista3);
		postoCentral.addFrentista(frentista4);
		postoCentral.addFrentista(frentista5);
		postoCentral.addFrentista(frentista6);
		
		bomba1.addFrentista(frentista1);
		bomba1.addFrentista(frentista2);
		bomba2.addFrentista(frentista3);
		bomba2.addFrentista(frentista4);
		bomba3.addFrentista(frentista5);
		bomba3.addFrentista(frentista6);
		
		System.out.println("-------------------- Dados do Posto --------------------");
		postoCentral.exibirDados();
	}
}
