package ifpe;

import java.util.ArrayList;

public class Delegado extends Pessoa{
	private String matricula;
	private ArrayList<Crime> listaCrimesSobResponsabilidade = new ArrayList<>();
	
	public Delegado(String nome, String cpf, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
	
	public Delegado() {}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public ArrayList<Crime> getListaCrimesSobResponsabilidade() {
		return listaCrimesSobResponsabilidade;
	}

	public void setListaCrimesSobResponsabilidade(ArrayList<Crime> listaCrimesSobResponsabilidade) {
		this.listaCrimesSobResponsabilidade = listaCrimesSobResponsabilidade;
	}

	@Override
	public void teste() {
		System.out.println("Teste");
	};
	
}
