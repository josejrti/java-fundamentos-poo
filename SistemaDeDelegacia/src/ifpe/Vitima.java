package ifpe;

import java.util.ArrayList;

public class Vitima extends Pessoa{
	private ArrayList<Crime> listaCrimesSofridos = new ArrayList<>();
	
	public Vitima() {}
	
	public Vitima(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public ArrayList<Crime> getListaCrimesSofridos() {
		return listaCrimesSofridos;
	}

	public void setListaCrimesSofridos(ArrayList<Crime> listaCrimesSofridos) {
		this.listaCrimesSofridos = listaCrimesSofridos;
	}

	@Override 
	public void teste() {
		System.out.println("Teste");
	}
}
