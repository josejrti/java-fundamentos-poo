package app;

public class Pedido {
    private int id;
    private String descricao;
    private String localEntrega;
    private Cliente comprador;
    private Cliente destinatario;
    private Produto produto;
    private Atendente atendente;

    public Pedido(int id, String descricao, String localEntrega, Cliente comprador,
                  Cliente destinatario, Produto produto, Atendente atendente) {
        this.id = id;
        this.descricao = descricao;
        this.localEntrega = localEntrega;
        this.comprador = comprador;
        this.destinatario = destinatario;
        this.produto = produto;
        this.atendente = atendente;
    }

    public void exibirDados() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Local de entrega: " + localEntrega);
        System.out.println("Comprador: " + comprador.getNome());
        System.out.println("Destinatário: " + destinatario.getNome());
        System.out.println("Produto: " + produto.getTipo() + " - " + produto.getDescricao());
        System.out.println("Atendente responsável: " + atendente.getNome());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalEntrega() {
        return localEntrega;
    }

    public void setLocalEntrega(String localEntrega) {
        this.localEntrega = localEntrega;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
}
