package app;
import java.util.ArrayList;

public class Servico {
	private int id;
	private String nome;
	private int cargaHoraria;
	private ArrayList<Funcionario> listaFuncionarios;
	
	public Servico() {
//		Construtor vazio
	}
	
	public Servico(int id, String nome, int cargaHoraria) {
		this.id = id;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.listaFuncionarios = new ArrayList<>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
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
		System.out.println("ID: " + id + " - Nome: " + nome + " - Carga horária: " + cargaHoraria + " Horas");
		System.out.println("\n--- Funcionários neste serviço:");
		for(Funcionario funcionario : listaFuncionarios) {
			System.out.println();
			System.out.println(funcionario.getNome());
		}
	}
}
