package ifpe;

public class Main {
	public static void main(String[] args) {
		
		Delegacia delegaciaCentral = new Delegacia("Delegacia Central", "Rua 2 Centro 555", null);
		
		Delegado delegado = new Delegado("João Alves", "7631282122", "DE-83217DYY");
		
		delegaciaCentral.setDelegado(delegado);
		
		Crime crime1 = new Crime(90, "Roubo de moto", "Praça do Centro", null, null, null, delegado);
		Crime crime2 = new Crime(90, "Roubo de carro", "Avenida Central", null, null, null, delegado);
		Crime crime3 = new Crime(90, "Roubo de bolsa", "Praça do ó", null, null, null, delegado);

		Criminoso criminoso1 = new Criminoso("Karlos Silva", "8317273212");
		Criminoso criminoso2 = new Criminoso("Kayke Santos", "5321221232");
		
		Vitima vitima1 = new Vitima("Hugo Moraes", "7321631231");
		Vitima vitima2 = new Vitima("Michele Karla", "3216421541");
		Vitima vitima3 = new Vitima("Higor Vitor", "12317321732");
		
		Arma arma1 = new Arma(66, "Faca", "Faca de cozinha");
		Arma arma2 = new Arma(67, "Canivete", "Canivete suiço");
		Arma arma3 = new Arma(68, "Pistola", "Pistola Qualibre 32");
				
		crime1.setCriminoso(criminoso1);
		crime2.setCriminoso(criminoso1);
		crime3.setCriminoso(criminoso2);
		
		crime1.setVitima(vitima1);
		crime2.setVitima(vitima2);
		crime3.setVitima(vitima3);
		
		crime1.setArma(arma1);
		crime2.setArma(arma2);
		crime3.setArma(arma3);
		
		delegaciaCentral.getListaCrimes().add(crime1);
		delegaciaCentral.getListaCrimes().add(crime2);
		delegaciaCentral.getListaCrimes().add(crime3);
		
		delegado.getListaCrimesSobResponsabilidade().add(crime1);
		delegado.getListaCrimesSobResponsabilidade().add(crime2);
		delegado.getListaCrimesSobResponsabilidade().add(crime3);
		
		vitima1.getListaCrimesSofridos().add(crime1);
		vitima2.getListaCrimesSofridos().add(crime2);
		vitima3.getListaCrimesSofridos().add(crime3);
		
		criminoso1.getListaCrimesCometidos().add(crime1);
		criminoso1.getListaCrimesCometidos().add(crime2);
		criminoso2.getListaCrimesCometidos().add(crime3);
		
		System.out.println("========== | " + delegaciaCentral.getNome() + " | ==========");
		System.out.println("\nEndereço: " + delegaciaCentral.getEndereco());
		System.out.println("Delegado responsável: " + delegaciaCentral.getDelegado().getNome());
		System.out.println("\n\n===== Crimes:");
		for (Crime crime : delegaciaCentral.getListaCrimes()) {
			System.out.println("\nDescrição: " + crime.getDescricao());
			System.out.println("Local: " + crime.getLocal());
			System.out.println("Vitíma: " + crime.getVitima().getNome());
			System.out.println("Criminoso: " + crime.getCriminoso().getNome());
			System.out.println("Arma: " + crime.getArma().getDescricao());
			System.out.println("Delegado: " + crime.getDelegado().getNome());
		}
		
	}
}
