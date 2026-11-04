package app;
import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private String telefone;
	private String cpf;
	private ArrayList<Reserva> listaReservas;
	
	public Cliente() {
//		Construtor vazio
	}
	
	public Cliente(int id, String nome, String telefone, String cpf) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.listaReservas = new ArrayList<>();
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
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	
	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}
	
	public void addReserva(Reserva reserva) {
		this.listaReservas.add(reserva);
	}
	
	public void exibirDados() {
		System.out.println("\nID: " + id + " - Nome: " + nome);
		System.out.println("Telefone: " + telefone + " - CPF: " + cpf);
		System.out.println("\n--- Reservas do cliente:");
		for(Reserva reserva : listaReservas) {
			System.out.println();
			reserva.exibirDados();
		}
	}
}
