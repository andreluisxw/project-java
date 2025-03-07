package exercicio3;

public class Produto {
    public int id, quantidade;
    public String descricao;
    public double preco;

    public Produto() {
        this.descricao = "Sem descricao";
    }

    public Produto(int id, String descricao, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Método comprar
    public void comprar(int x) {
        this.quantidade += x;
    }

    // Método vender
    public void vender(int x) {
        if (this.quantidade >= x) {
            this.quantidade -= x;
        } else {
            System.out.println("Estoque insuficiente para vender " + x + " unidades de " + this.descricao);
        }
    }

    // Método subir preço
    public void subir(float x) {
        this.preco += x;
    }

    // Método descer preço
    public void descer(float x) {
        if (this.preco >= x) {
            this.preco -= x;
        } else {
            System.out.println("O preço não pode ser menor que zero.");
            this.preco = 0; // Define o preço para zero caso a redução seja maior que o preço atual.
        }

    }

    // Método mostra
    public void exibirDetalhes() {
        System.out.println("--- Informações do Produto ---");
        System.out.println("ID: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade em estoque: " + this.quantidade);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco)); // Formata o preço para 2 casas decimais
        System.out.println("-------------------------------");
    }
}
