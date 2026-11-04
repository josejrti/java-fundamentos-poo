package app;
import java.util.ArrayList;

public class Recepcionista {
	private int id;
	private String nome;
	private String telefone;
	private ArrayList<Reserva> listaReservas;
	
	public Recepcionista() {
//		Construtor vazio
	}
	
	public Recepcionista(int id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
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
	
	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	
	public ArrayList<Reserva> getListaReservas(){
		return listaReservas;
	}
	
	public void addReserva(Reserva reserva) {
		this.listaReservas.add(reserva);
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " - Nome: " + nome + " - Telefone: " + telefone);
		System.out.println("\n- Reservas do recepcionista:");
		for(Reserva reserva : listaReservas) {
			System.out.println();
			System.out.println("Data de entrada: " + reserva.getDataEntrada() +
					" - Data de saída: " + reserva.getDataSaida() +
					" - Status: " + reserva.getStatus());
		}
	}
}
