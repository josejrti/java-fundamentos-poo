package app;
import java.util.ArrayList;

public class Atendente {
    private String nome;
    private String matricula;
    private ArrayList<Pedido> pedidos;

    public Atendente(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void exibirDados() {
        System.out.println("Atendente: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Pedidos atendidos: " + pedidos.size());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}