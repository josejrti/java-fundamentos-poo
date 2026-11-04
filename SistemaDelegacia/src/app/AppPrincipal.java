package app;

public class AppPrincipal {
	public static void main(String[] args) {
		Delegacia delegaciaCentral = new Delegacia("Delegacia Central", "Rua F, 543.");
		Delegado delegado = new Delegado("Marcos Silva", "DC-34128KVM");
		Pessoa criminoso = new Pessoa("Carlos Lima", "412.332.321-31");
		Pessoa vitima = new Pessoa("Ana Souza", "543.643.123-77");
		Arma arma = new Arma("Faca", "Faca de cozinha");
		Crime crime1 = new Crime(55, "Roubo de moto", "Praça Mauriti", criminoso, vitima, arma, delegado);
		Crime crime2 = new Crime(56, "Roubo de carro", "Sulanca", criminoso, vitima, arma, delegado);
		
		delegaciaCentral.addDelegado(delegado);
		delegaciaCentral.addCrime(crime1);
		delegaciaCentral.addCrime(crime2);
		
		delegado.addCrime(crime1);
		delegado.addCrime(crime2);
		
		criminoso.addCrime(crime1);
		criminoso.addCrime(crime2);
		
		vitima.addCrime(crime1);
		vitima.addCrime(crime2);
		
		System.out.println("-------------------- DADOS DA DELEGACIA --------------------");
		delegaciaCentral.exibirDados();
	}
}
