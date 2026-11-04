package app;

public class AppPrincipal {
	public static void main(String[] args) {
		
	Academia centralFit = new Academia("Central Fit");
	
	Plano plano1 = new Plano("Leve Fitness", 30.00, 6);
	Plano plano2 = new Plano("Master Fitness", 70.00, 9);
	Plano plano3 = new Plano("Premium Fitness", 150.00, 12);
	Plano plano4 = new Plano("Platinum Fitness", 250.00, 24);

	Aluno aluno1 = new Aluno(10, "Jucimar Oliveira", "(81) 99311-8321", "juci@gmail.com", "CF-2026JKYML", "10/01/2026", plano1);
	Aluno aluno2 = new Aluno(11, "Oliveira Silva", "(81) 99123-3124", "oliverasilvaa@gmail.com", "CF-2026OKYML", "23/03/2026", plano2);
	Aluno aluno3 = new Aluno(12, "Vinicius Suares", "(81) 99561-2314", "vinisuar@gmail.com", "CF-2026VKYML", "05/02/2026", plano3);
	Aluno aluno4 = new Aluno(13, "Carlos Lima", "(81) 99012-8412", "limacarlos@gmail.com", "CF-2026CKYML", "29/04/2026", plano4);
	Aluno aluno5 = new Aluno(14, "Vitoria Renata", "(81) 92131-1200", "vitoriasssre@gmail.com", "CF-2026VRKYML", "01/04/2026", plano1);
	Aluno aluno6 = new Aluno(15, "Kandra Giula", "(81) 98521-2311", "kandragiula33@gmail.com", "CF-2026KKYML", "03/04/2026", plano1);

	
	centralFit.addAluno(aluno1);
	centralFit.addAluno(aluno2);
	centralFit.addAluno(aluno3);
	centralFit.addAluno(aluno4);
	centralFit.addAluno(aluno5);
	centralFit.addAluno(aluno6);
	
	centralFit.addPlano(plano1);
	centralFit.addPlano(plano2);
	centralFit.addPlano(plano3);
	centralFit.addPlano(plano4);
	
	Instrutor instrutor1 = new Instrutor(20, "Kaique Gomes", "(81) 93021-8313", "kaiques@hotmail.com", "Braços");
	Instrutor instrutor2 = new Instrutor(21, "Marcos Pimentel", "(81) 95120-3123", "pimentelmar@hotmail.com", "Coxas");
	Instrutor instrutor3 = new Instrutor(22, "Sandra Alves", "(81) 97512-0932", "sandraalves123@hotmail.com", "Costas");
	Instrutor instrutor4 = new Instrutor(23, "Vania Melo", "(81) 96123-0031", "vaniamelosss@hotmail.com", "Panturrilhas");
	
	instrutor1.addAluno(aluno1);
	instrutor2.addAluno(aluno2);
	instrutor3.addAluno(aluno3);
	instrutor4.addAluno(aluno4);
	instrutor4.addAluno(aluno5);
	instrutor4.addAluno(aluno6);
	
	centralFit.addInstrutor(instrutor1);
	centralFit.addInstrutor(instrutor2);
	centralFit.addInstrutor(instrutor3);
	centralFit.addInstrutor(instrutor4);
	
	Funcionario funcionario1 = new Funcionario(40, "Silmar Oliveira", "(81) 99213-2133", "silmaroliver@gmail.com", "Faxineiro", 1500.00);
	Funcionario funcionario2 = new Funcionario(41, "Roberta Daiane", "(81) 94812-1321", "daianroberta@gmail.com", "Faxineira", 1500.00);
	Funcionario funcionario3 = new Funcionario(42, "Gilmar Hugo", "(81) 91133-3121", "gilmarhuggs@gmail.com", "Atendente", 2500.00);
	Funcionario funcionario4 = new Funcionario(44, "Fernanda Flavia", "(81) 99130-0121", "flaviafernd@gmail.com", "Atendente", 3500.00);
	Funcionario funcionario5 = new Funcionario(43, "Jurimar Goes", "(81) 99312-8456", "jurimargoesgg@gmail.com", "Geremte", 2500.00);

	centralFit.addFuncionario(funcionario1);
	centralFit.addFuncionario(funcionario2);
	centralFit.addFuncionario(funcionario3);
	centralFit.addFuncionario(funcionario4);
	centralFit.addFuncionario(funcionario5);
	
	Treino treino1 = new Treino("Treino de Braços", "Leve", aluno1, instrutor1);
	Treino treino2 = new Treino("Treino de Coxas", "Médio", aluno2, instrutor2);
	Treino treino3 = new Treino("Treino de Costas", "Médio", aluno3, instrutor3);
	Treino treino4 = new Treino("Treino de Panturrilha", "Avançado", aluno4, instrutor4);
	Treino treino5 = new Treino("Treino de Braços", "Médio", aluno5, instrutor4);
	Treino treino6 = new Treino("Treino de Braços", "Leve", aluno6, instrutor4);	

	aluno1.addTreino(treino1);
	aluno2.addTreino(treino2);
	aluno3.addTreino(treino3);
	aluno4.addTreino(treino4);
	aluno5.addTreino(treino5);
	aluno6.addTreino(treino6);
	
	instrutor1.addTreino(treino1);
	instrutor2.addTreino(treino2);
	instrutor3.addTreino(treino3);
	instrutor4.addTreino(treino4);
	instrutor4.addTreino(treino5);
	instrutor4.addTreino(treino6);
	
	Pagamento pagamento1 = new Pagamento(180.00, "10/01/2026", "Pago", aluno1);
	Pagamento pagamento2 = new Pagamento(630.00, "23/03/2026", "Pago", aluno2);
	Pagamento pagamento3 = new Pagamento(1800.00, "05/02/2026", "Pago", aluno3);
	Pagamento pagamento4 = new Pagamento(6000.00, "29/04/2026", "Pago", aluno4);
	Pagamento pagamento5 = new Pagamento(180.00, "01/04/2026", "Pago", aluno5);
	Pagamento pagamento6 = new Pagamento(180.00, "03/04/2026", "Pago", aluno6);

	aluno1.addPagamento(pagamento1);
	aluno2.addPagamento(pagamento2);
	aluno3.addPagamento(pagamento3);
	aluno4.addPagamento(pagamento4);
	aluno5.addPagamento(pagamento5);
	aluno6.addPagamento(pagamento6);
	
	System.out.println("-------------------- Dados Da Academia --------------------");
	centralFit.exibirDados();
	
	}
}
