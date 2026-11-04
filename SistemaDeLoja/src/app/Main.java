package app;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja("Loja Central", "Rua Principal, 100");

        Atendente atendente = new Atendente("Marcos Silva", "ATD001");
        loja.adicionarAtendente(atendente);

        Cliente comprador = new Cliente("Carlos Lima", "111.111.111-11");
        Cliente destinatario = new Cliente("Ana Souza", "222.222.222-22");

        Produto produto = new Produto(1, "Mochila", "Mochila escolar preta");

        Pedido pedido1 = new Pedido(1, "Pedido de material escolar", "Centro",
                comprador, destinatario, produto, atendente);

        Pedido pedido2 = new Pedido(2, "Pedido de acessórios", "Bairro Novo",
                comprador, destinatario, produto, atendente);

        comprador.adicionarPedido(pedido1);
        comprador.adicionarPedido(pedido2);

        atendente.adicionarPedido(pedido1);
        atendente.adicionarPedido(pedido2);

        loja.adicionarPedido(pedido1);
        loja.adicionarPedido(pedido2);

        System.out.println("===== DADOS DA LOJA =====");
        System.out.println("Nome: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());

        System.out.println("\n--- Atendentes ---");
        for (int i = 0; i < loja.getAtendentes().size(); i++) {
            Atendente a = loja.getAtendentes().get(i);
            System.out.println("Nome: " + a.getNome());
        }

        System.out.println("\n--- Pedidos da Loja ---");
        for (int i = 0; i < loja.getPedidos().size(); i++) {
            Pedido p = loja.getPedidos().get(i);

            System.out.println("ID: " + p.getId());
            System.out.println("Descrição: " + p.getDescricao());

            // acessando objetos dentro de objetos
            System.out.println("Produto: " + p.getProduto().getTipo());
            System.out.println("Atendente: " + p.getAtendente().getNome());
            System.out.println("Comprador: " + p.getComprador().getNome());
            System.out.println("Destinatário: " + p.getDestinatario().getNome());
            System.out.println("---");
        }

        System.out.println("\n===== PEDIDOS DO CLIENTE =====");
        for (int i = 0; i < comprador.getPedidos().size(); i++) {
            Pedido p = comprador.getPedidos().get(i);

            System.out.println("Pedido: " + p.getDescricao());
            System.out.println("Produto: " + p.getProduto().getTipo());
        }
    }
}