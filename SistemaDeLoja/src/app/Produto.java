package app;

public class Produto {
    private int numeroId;
    private String tipo;
    private String descricao;

    public Produto(int numeroId, String tipo, String descricao) {
        this.numeroId = numeroId;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public void exibirDados() {
        System.out.println("Produto ID: " + numeroId);
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

