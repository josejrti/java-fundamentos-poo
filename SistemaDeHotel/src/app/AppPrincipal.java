package app;

public class AppPrincipal {
	public static void main(String[] args) {
		Hotel hotelCentral = new Hotel(1, "Hotel Central", "Centro, 543");
		Andar andar1 = new Andar(1, "Andar Popular", 2);
		Andar andar2 = new Andar(2, "Andar Premium", 2);
		
		hotelCentral.addAndar(andar1);
		hotelCentral.addAndar(andar2);
		
		Quarto quarto1 = new Quarto(6, 4, 100.00, "Alugado");
		Quarto quarto2 = new Quarto(7, 4, 100.00, "Disponivel");
		Quarto quarto3 = new Quarto(8, 4, 500.00, "Alugado");
		Quarto quarto4 = new Quarto(9, 4, 500.00, "Alugado");
		
		andar1.addQuarto(quarto1);
		andar1.addQuarto(quarto2);
		andar2.addQuarto(quarto3);
		andar2.addQuarto(quarto4);
		
		Cliente cliente1 = new Cliente(55, "Carlos Silva", "(81) 9945-5432", "444.322.412-11");
		Cliente cliente2 = new Cliente(56, "Michele Carla", "(81) 9835-7642", "563.123.532-89");
		Cliente cliente3 = new Cliente(57, "Luana Maria", "(81) 9452-2530", "823.321.003-61");
		
		Conta conta1 = new Conta(30, 400.00, "Pago");
		Conta conta2 = new Conta(31, 200.00, "Pago");
		Conta conta3 = new Conta(32, 1000.00, "Pago");
		Conta conta4 = new Conta(33, 1000.00, "Pago");
		
		Reserva reserva1 = new Reserva(10, "22/04/26", "25/04/26", "Em Andamento", quarto1, conta1);
		Reserva reserva2 = new Reserva(11, "22/04/26", "23/04/26", "Em Andamento", quarto2, conta2);
		Reserva reserva3 = new Reserva(12, "22/04/26", "23/04/26", "Em Andamento", quarto3, conta3);
		Reserva reserva4 = new Reserva(13, "22/04/26", "23/04/26", "Em Andamento", quarto4, conta4);
		
		cliente1.addReserva(reserva1);
		cliente2.addReserva(reserva2);
		cliente3.addReserva(reserva3);
		cliente3.addReserva(reserva4);
		
		Gerente gerente1 = new Gerente(66, "Rosimar Rodrigues", "(81) 9632-2241");
		Recepcionista recepcionista1 = new Recepcionista(55, "Karlos Kauan", "(81) 9143-9102");
		Recepcionista recepcionista2 = new Recepcionista(56, "Sandra Alves", "(81) 9541-3143");
		
		gerente1.addRecepcionista(recepcionista1);
		gerente1.addRecepcionista(recepcionista2);
		
		recepcionista1.addReserva(reserva1);
		recepcionista1.addReserva(reserva2);
		recepcionista2.addReserva(reserva3);
		recepcionista2.addReserva(reserva4);
		
		System.out.println("-------------------- Dados do Hotel --------------------");
		hotelCentral.exibirDados();
		System.out.println("\n-------------------- Andares do Hotel --------------------");
		for (int i = 0; i < hotelCentral.getListaAndares().size(); i++) {
			System.out.println();
			System.out.println("Andar: " + hotelCentral.getListaAndares().get(i).getDescricao());
		}
//		for (Andar andar : hotelCentral.getListaAndares()) {
//			System.out.println();
//			System.out.println("Andar: " + andar.getDescricao());
//		}
		System.out.println("\n-------------------- Dados do Gerente --------------------");
		gerente1.exibirDados();
	}
}
