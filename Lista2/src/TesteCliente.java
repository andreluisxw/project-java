import exe1.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente("1234567-8", "12345-6", "Fulano da Silva", 1000.0f);
        fulano.realizarDeposito(500.0f);
        fulano.realizarSaque(200.0f);
        fulano.imprimirInformacoes();


    }
}