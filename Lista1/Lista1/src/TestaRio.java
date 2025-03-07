import exercicio4.Rio;

public class TestaRio {
    public static void main(String[] args) {
        // Criação de dois rios usando construtores diferentes
        Rio rio1 = new Rio(); // Construtor sem parâmetros
        Rio rio2 = new Rio("Rio Tietê", 10.5f, true); // Construtor com parâmetros

        // Teste dos métodos para rio1
        System.out.println("Informações do Rio 1:");
        rio1.mostra();
        rio1.chover(2.0f);
        rio1.sujar();
        System.out.println("\nInformações do Rio 1 após chuva e poluição:");
        rio1.mostra();

        // Teste dos métodos para rio2
        System.out.println("\nInformações do Rio 2:");
        rio2.mostra();
        rio2.ensolarar(3.0f);
        rio2.limpar();
        System.out.println("\nInformações do Rio 2 após sol e limpeza:");
        rio2.mostra();
    }
}