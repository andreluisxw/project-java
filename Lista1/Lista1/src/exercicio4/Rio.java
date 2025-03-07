package exercicio4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    //construtor sem parametros
    public Rio() {
        this.nome = "Sem nome";
    }

    // Construtor com parâmetros
    public Rio(String nome, float nivel, boolean poluído) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluído;
    }

    // Método chover
    public void chover(float quantidade) {
        this.nivel += quantidade;
    }

    // Método ensolarar
    public void ensolarar(float quantidade) {
        this.nivel -= quantidade;
        if (this.nivel < 0) {
            this.nivel = 0; // Garante que o nível não seja negativo
        }
    }

    // Método limpar
    public void limpar() {
        this.poluido = false;
    }

    // Método sujar
    public void sujar() {
        this.poluido = true;
    }

    // Método mostra
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Poluído: " + (this.poluido ? "Sim" : "Não"));
    }
}
