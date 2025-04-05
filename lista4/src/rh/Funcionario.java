package rh;

public abstract class Funcionario {

    protected String cpf, nome, endereco;
    protected float salario;

    //construtor vazio
    public Funcionario(){
        this.nome = "Sem nome";
        this.endereco = "Sem endereço";
    }

    //construtor
    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    //getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public float getSalario() {
        return salario;
    }

    //setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //calculaSalario
    public abstract float calculaSalario();

    //toString
    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                '}';
    }
}
