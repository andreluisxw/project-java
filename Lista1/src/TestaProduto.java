import exercicio3.Produto;

public class TestaProduto {
    public static void main(String[] args) {
        // Criando o primeiro Produto usando o construtor com parâmetros
        Produto produto1 = new Produto(123, "Camiseta Algodão", 50, 29.99);
        System.out.println("Produto 1 criado com construtor com parâmetros:");
        produto1.exibirDetalhes();

        // Criando o segundo Produto usando o construtor sem parâmetros
        Produto produto2 = new Produto();
        System.out.println("\nProduto 2 criado com construtor sem parâmetros:");
        produto2.exibirDetalhes();

        System.out.println("\n--- Testando métodos do Produto 1 ---");
        produto1.comprar(20);
        System.out.println("\nComprando 20 unidades do Produto 1:");
        produto1.exibirDetalhes();

        produto1.vender(10);
        System.out.println("\nVendendo 10 unidades do Produto 1:");
        produto1.exibirDetalhes();

        produto1.subir(5.0f);
        System.out.println("\nAumentando o preço do Produto 1 em R$ 5.00:");
        produto1.exibirDetalhes();

        produto1.descer(2.5f);
        System.out.println("\nDiminuindo o preço do Produto 1 em R$ 2.50:");
        produto1.exibirDetalhes();

        System.out.println("\n--- Testando métodos do Produto 2 ---");
        produto2.id = 456;
        produto2.descricao = "Calça Jeans";
        produto2.quantidade = 100;
        produto2.preco = 79.90;
        System.out.println("\nProduto 2 após definir atributos manualmente:");
        produto2.exibirDetalhes();

        produto2.comprar(30);
        System.out.println("\nComprando 30 unidades do Produto 2:");
        produto2.exibirDetalhes();

        produto2.vender(120); // Tentando vender mais do que em estoque
        System.out.println("\nTentando vender 120 unidades do Produto 2 (estoque insuficiente):");
        produto2.exibirDetalhes();

        produto2.subir(10.0f);
        System.out.println("\nAumentando o preço do Produto 2 em R$ 10.00:");
        produto2.exibirDetalhes();

        produto2.descer(100.0f); // Tentando reduzir o preço mais do que o valor atual
        System.out.println("\nTentando diminuir o preço do Produto 2 em R$ 100.00 (preço não pode ser negativo):");
        produto2.exibirDetalhes();
    }
}
