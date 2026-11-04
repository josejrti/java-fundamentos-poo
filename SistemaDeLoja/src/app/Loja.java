package app;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private String endereco;
    private ArrayList<Atendente> atendentes;
    private ArrayList<Pedido> pedidos;

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.atendentes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarAtendente(Atendente atendente) {
        atendentes.add(atendente);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void exibirDados() {
        System.out.println("Loja: " + nome);
        System.out.println("Endereço: " + endereco);

        System.out.println("\nAtendentes cadastrados:");
        for (int i = 0; i < atendentes.size(); i++) {
            System.out.println("-------------------------");
            atendentes.get(i).exibirDados();
        }

        System.out.println("\nPedidos cadastrados:");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("-------------------------");
            pedidos.get(i).exibirDados();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Atendente> getAtendentes() {
        return atendentes;
    }

    public void setAtendentes(ArrayList<Atendente> atendentes) {
        this.atendentes = atendentes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}