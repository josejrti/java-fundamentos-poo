package app;
import java.util.ArrayList;

public class Caixa {
	private int id;
	private ArrayList<Funcionario> listaFuncionarios; 
	
	public Caixa() {
//		Construtor vazio
	}
	
	public Caixa(int id) {
		this.id = id;
		this.listaFuncionarios = new ArrayList<>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public ArrayList<Funcionario> getListaFuncionarios(){
		return listaFuncionarios;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.listaFuncionarios.add(funcionario);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id);
		System.out.println("\n--- Funcionários deste Caixa:");
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println();
			System.out.println("Nome: " + funcionario.getNome() + " - Função: " + funcionario.getFuncao());
		}
	}
}
