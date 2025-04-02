import exercicio2.Cliente;

public class TestaCliente {
    public static void main(String[] args) {

        // Instanciação da classe Cliente para Fulano
        exercicio2.Cliente fulano = new Cliente(12345, 1000, "Fulano da Silva", 1000.00f);

        System.out.println("Dados da conta de Fulano (inicial):");
        System.out.println(fulano.mostrarDadosConta()); // Exibe dados iniciais da conta de Fulano
        System.out.println();

        // Realizando depósito e saque na conta de Fulano
        fulano.realizarDeposito(500.00f); // Fulano deposita 500 reais
        fulano.realizarSaque(200.00f);    // Fulano saca 200 reais
        fulano.realizarSaque(2000.00f);   // Fulano tenta sacar 2000 reais (saldo insuficiente)

        System.out.println("\nDados da conta de Fulano (após operações):");
        System.out.println(fulano.mostrarDadosConta()); // Exibe dados da conta de Fulano após as operações
        System.out.println("\n-----------------------------\n"); // Separador


        // Instanciação da classe Cliente para Beltrano
        exercicio2.Cliente beltrano = new Cliente(54321, 1001, "Beltrano Santos", 50.00f);

        System.out.println("Dados da conta de Beltrano (inicial):");
        System.out.println(beltrano.mostrarDadosConta()); // Exibe dados iniciais da conta de Beltrano
        System.out.println();

        // Realizando depósito e saque na conta de Beltrano
        beltrano.realizarDeposito(100.00f); // Beltrano deposita 100 reais
        beltrano.realizarSaque(20.00f);     // Beltrano saca 20 reais
        beltrano.realizarSaque(150.00f);    // Beltrano tenta sacar 150 reais (saldo insuficiente)

        System.out.println("\nDados da conta de Beltrano (após operações):");
        System.out.println(beltrano.mostrarDadosConta()); // Exibe dados da conta de Beltrano após as operações
    }
}