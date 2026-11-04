package ifpe;

public class Main {
	public static void main(String[] args) {
		Delegacia delegaciaCentral = new Delegacia("Delegacia Central", "Centro");
		Delegado delegado = new Delegado("Marcos Silva", "123D");
		Pessoa criminoso = new Pessoa("Carlos Lima", "842.456.222");
		Pessoa vitima = new Pessoa("Ana Souza", "123.321.412");
		Arma arma = new Arma(55, "Faca", "Faca de cozinha");
		Crime crime1 = new Crime(1, "Roubo de carro", "Sulanca", criminoso, vitima, arma, delegado);
		Crime crime2 = new Crime(2, "Roubo de moto", "Praça do centro", criminoso, vitima, arma, delegado);
		
		delegaciaCentral.addDelegado(delegado);
		delegaciaCentral.addCrime(crime1);
		delegaciaCentral.addCrime(crime2);
		
		delegado.addCrime(crime1);
		delegado.addCrime(crime2);
		
		criminoso.addCrime(crime1);
		criminoso.addCrime(crime2);
		vitima.addCrime(crime1);
		vitima.addCrime(crime2);
		
		delegaciaCentral.exibirDados();
	}
}
