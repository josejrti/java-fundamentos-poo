package app;

public class AppPrincipal {
	public static void main(String[] args) {
		Ecommerce compraFacil = new Ecommerce(15, "Compra Fácil", "comprafacil.com");
		
		Categoria cozinha = new Categoria(33, "Cozinha");
		Categoria tecnologia = new Categoria(34, "Tecnologia");
		Categoria eletrodomestico = new Categoria(33, "Eletrodoméstico");
		Categoria cama = new Categoria(33, "Cama");

		compraFacil.addCategoria(cozinha);
		compraFacil.addCategoria(tecnologia);
		compraFacil.addCategoria(eletrodomestico);
		compraFacil.addCategoria(cama);
		
		Cliente cliente1 = new Cliente(10, "João Paulo", "Rua Principal Fernandes, 400.", "(81) 93214-2312", "123.553.432-43");
		Cliente cliente2 = new Cliente(11, "Maria Andrade", "Rua Augusta, 550.", "(81) 94231-4312", "212.321.456-43");	
		Cliente cliente3 = new Cliente(12, "Carlos Lima", "Rua Onofre, 98.", "(81) 9214-4456", "555.321.456-43");
		Cliente cliente4 = new Cliente(13, "Vitoria Bueno", "Rua Gales, 555.", "(81) 95671-41278", "931.496.456-11");
		
		Marca marca1 = new Marca(90, "LuxePeople", "Inglaterra");
		Marca marca2 = new Marca(91, "MagazineTalher", "Brasil");
		Marca marca3 = new Marca(92, "ASUS", "Brasil");
		Marca marca4 = new Marca(93, "AOC", "Brasil");
		Marca marca5 = new Marca(94, "LG", "EUA");
		Marca marca6 = new Marca(95, "Samsung", "EUA");
		Marca marca7 = new Marca(96, "UltraConfort", "EUA");
		
		compraFacil.addMarca(marca1);
		compraFacil.addMarca(marca2);
		compraFacil.addMarca(marca3);
		compraFacil.addMarca(marca4);
		compraFacil.addMarca(marca5);
		compraFacil.addMarca(marca6);
		compraFacil.addMarca(marca7);
		
		Produto produto1 = new Produto(1, "Mesa De Cozinha", "Mesa Flex Madeira Inglesa", "Luxo", marca1, "Branca", 300.00, cozinha, cliente1);
		Produto produto2 = new Produto(2, "Conjunto de Talheres", "Talheres Conjunto Premium", "Cozinha Alemã", marca2, "Cinza", 90.00, cozinha, cliente1);
		Produto produto3 = new Produto(3, "Notebook ASUS", "8GB Ram, 250 GB, i9", "ASUS NewEra", marca3, "Preto", 4500.00, tecnologia, cliente2);
		Produto produto4 = new Produto(4, "Monitor AOC", "Monitor para computador 8K 3440x5421", "AOC Luxe Version", marca4, "Preto", 2500.00, tecnologia, cliente2);
		Produto produto5 = new Produto(5, "Smart TV LG", "8K Ultra, Legacy, Adroid TV", "LG Confort2026", marca5, "Preto", 5000.00, eletrodomestico, cliente3);
		Produto produto6 = new Produto(6, "Smart TV Samgung", "8K Max, VIDAA TV", "In serach of incredible", marca6, "Preto", 5000.00, eletrodomestico, cliente3);
		Produto produto7 = new Produto(7, "Cama Casal UltraConfort", "1233X821E Buster", "Casal Max", marca7, "Prateada", 1000.00, cama, cliente4);
		Produto produto8 = new Produto(8, "Cama Solteiro UltraConfort", "32132x32131 DFlex", "Solteiro Relax", marca7, "Preta", 900.00,  cama, cliente4);
		
		marca1.addProduto(produto1);
		marca2.addProduto(produto2);
		marca3.addProduto(produto3);
		marca4.addProduto(produto4);
		marca5.addProduto(produto5);
		marca6.addProduto(produto6);
		marca7.addProduto(produto7);
		marca7.addProduto(produto8);
		
		Carrinho carrinho1 = new Carrinho(20, cliente1, 390.00);
		Carrinho carrinho2 = new Carrinho(21, cliente2, 7000.00);
		Carrinho carrinho3 = new Carrinho(22, cliente3, 10000.00);
		Carrinho carrinho4 = new Carrinho(23, cliente4, 1900.00);
		
		compraFacil.addCarrinho(carrinho1);
		compraFacil.addCarrinho(carrinho2);
		compraFacil.addCarrinho(carrinho3);
		compraFacil.addCarrinho(carrinho4);
		
		compraFacil.addCliente(cliente1);
		compraFacil.addCliente(cliente2);
		compraFacil.addCliente(cliente3);
		compraFacil.addCliente(cliente4);
		
		cozinha.addProduto(produto1);
		cozinha.addProduto(produto2);
		tecnologia.addProduto(produto3);
		tecnologia.addProduto(produto4);
		eletrodomestico.addProduto(produto5);
		eletrodomestico.addProduto(produto6);
		cama.addProduto(produto7);
		cama.addProduto(produto8);
		
		carrinho1.addProduto(produto1);
		carrinho1.addProduto(produto2);
		carrinho2.addProduto(produto3);
		carrinho2.addProduto(produto4);
		carrinho3.addProduto(produto5);
		carrinho3.addProduto(produto6);
		carrinho4.addProduto(produto7);
		carrinho4.addProduto(produto8);

		cliente1.addCarrinho(carrinho1);
		cliente2.addCarrinho(carrinho2);
		cliente3.addCarrinho(carrinho3);
		cliente4.addCarrinho(carrinho4);

		System.out.println("-------------------- Dados Do E-Commerce --------------------");
		compraFacil.exibirDados();
	}
}
