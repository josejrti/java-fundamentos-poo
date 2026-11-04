package app;

public class AppPrincipal {
	public static void main(String[] args) {
		Supermercado hiperBarato = new Supermercado(1,"Hiper Barato", "Rua f, Centro 456.");
		Produto produto1 = new Produto(55, "Margarina", "Margarina Pasterizada", 20.00);
		Produto produto2 = new Produto(56, "Arroz", "Arroz Branco", 14.00);
		Produto produto3 = new Produto(57, "Feijão", "Feijão Carioca", 23.00);
		Produto produto4 = new Produto(58, "Uva", "Uva verde", 10.00);
		Produto produto5 = new Produto(59, "Macarrão", "Macarrão espaguete", 10.00);
		
		hiperBarato.addProduto(produto1);
		hiperBarato.addProduto(produto2);
		hiperBarato.addProduto(produto3);
		hiperBarato.addProduto(produto4);
		hiperBarato.addProduto(produto5);
		
		Funcionario funcionario1 = new Funcionario(11, "João Silva", "(81) 9999-2313", "Motorista");
		Funcionario funcionario2 = new Funcionario(12, "Marcos Melo", "(81) 9321-4124", "Auxiliar de Motorista");
		Funcionario funcionario3 = new Funcionario(13, "Silvania Bruna", "(81) 9561-7512", "Caixa");
		Funcionario funcionario4 = new Funcionario(14, "Joaquim Beto", "(81) 9314-9121", "Mochileiro");
		Funcionario funcionario5 = new Funcionario(15, "Hugo Santos", "(81) 9612-1231", "Caixa");
		Funcionario funcionario6 = new Funcionario(16, "Bruno Miguel", "(81) 9542-4412", "Mochileiro");
		Funcionario funcionario7 = new Funcionario(17, "Maicon Dante", "(81) 9153-5432", "Motorista");
		Funcionario funcionario8 = new Funcionario(18, "Renzo Julio", "(81) 9314-4325", "Auxiliar de Motorista");

		hiperBarato.addFuncionario(funcionario1);
		hiperBarato.addFuncionario(funcionario2);
		hiperBarato.addFuncionario(funcionario3);
		hiperBarato.addFuncionario(funcionario4);
		hiperBarato.addFuncionario(funcionario5);
		hiperBarato.addFuncionario(funcionario6);
		hiperBarato.addFuncionario(funcionario7);
		hiperBarato.addFuncionario(funcionario8);
		
		Caixa caixa1 = new Caixa(3);
		Caixa caixa2 = new Caixa(4);
		
		caixa1.addFuncionario(funcionario3);
		caixa1.addFuncionario(funcionario4);
		caixa2.addFuncionario(funcionario5);
		caixa2.addFuncionario(funcionario6);
		
		hiperBarato.addCaixa(caixa1);
		hiperBarato.addCaixa(caixa2);
		
		Caminhao caminhao1 = new Caminhao(55, "Volkswagem", "Constellation", "KBA-3214", 500);
		Caminhao caminhao2 = new Caminhao(56, "Volvo", "FH-MAX-PREMIUM", "RHD-3214", 550);
		
		caminhao1.addFuncionario(funcionario1);
		caminhao1.addFuncionario(funcionario2);
		caminhao2.addFuncionario(funcionario7);
		caminhao2.addFuncionario(funcionario8);
		
		hiperBarato.addCaminhao(caminhao1);
		hiperBarato.addCaminhao(caminhao2);
		
		System.out.println("-------------------- DADOS DO SUPERMERCADO --------------------");
		hiperBarato.exibirDados();

	}
}
