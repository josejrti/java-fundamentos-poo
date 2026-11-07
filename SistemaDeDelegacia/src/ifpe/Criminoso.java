package ifpe;

import java.util.ArrayList;

public class Criminoso extends Pessoa{
	private ArrayList<Crime> listaCrimesCometidos = new ArrayList<>();
		
	public Criminoso(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public Criminoso() {}

	public ArrayList<Crime> getListaCrimesCometidos() {
		return listaCrimesCometidos;
	}

	public void setListaCrimesCometidos(ArrayList<Crime> listaCrimesCometidos) {
		this.listaCrimesCometidos = listaCrimesCometidos;
	}
	
	@Override
	public void teste() {
		System.out.println("Teste");
	}
}
