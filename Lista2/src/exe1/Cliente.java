package exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    // Construtor sem argumentos
    public Cliente() {
        this.numeroConta = "00000000";
        this.numeroAgencia = "000000";
        this.nome = "Cliente Padrão";
        this.saldo = 0.0f;
    }

    // Construtor com argumentos
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        setNumeroConta(numeroConta);
        setNumeroAgencia(numeroAgencia);
        setNome(nome);
        setSaldo(saldo);
    }

    // Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta != null && numeroConta.length() == 8 && numeroConta.matches("\\d{7}-\\d")) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Número de conta inválido.");
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia != null && numeroAgencia.length() == 6 && numeroAgencia.matches("\\d{5}-\\d")) {
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Número de agência inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }

    // Métodos de depósito e saque
    public void realizarDeposito(float valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void realizarSaque(float valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saque inválido.");
        }
    }

    // Método para imprimir informações
    public void imprimirInformacoes() {
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Número da Agência: " + this.numeroAgencia);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }
}
