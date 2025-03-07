package exercicio2;

public class Cliente {
    //Variaveis primitivas
    public int numeroConta;
    public int numeroAgencia;
    public float saldo;

    //Variáveis classes
    public String nome;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para realizar um depósito na conta
    public void realizarDeposito(float valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito; // Adiciona o valor do depósito ao saldo
            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso na conta " + this.numeroConta + ".");
        } else {
            System.out.println("Valor de depósito inválido. Digite um valor maior que zero.");
        }
    }

    // Método para realizar um saque na conta
    public void realizarSaque(float valorSaque) {
        if (valorSaque > 0 && valorSaque <= this.saldo) {
            this.saldo -= valorSaque; // Subtrai o valor do saque do saldo
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso na conta " + this.numeroConta + ".");
        } else if (valorSaque <= 0) {
            System.out.println("Valor de saque inválido. Digite um valor maior que zero.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque na conta " + this.numeroConta + ".");
        }
    }

    // Método para retornar os dados da conta (numeroConta, nome e saldo atual)
    public String mostrarDadosConta() {
        return "Número da Conta: " + this.numeroConta +
                ", Nome do Cliente: " + this.nome +
                ", Saldo Atual: R$" + String.format("%.2f", this.saldo); // Formatando o saldo para 2 casas decimais
    }
}
