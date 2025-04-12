package rh;

public class Gerente extends Funcionario {

    private float bonus;

    //construtor sem parametros
    public Gerente(){
        super(); //chama o construtor VAZIO da superclasse ou classe pai
    }

    //construtor
    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(cpf, nome, endereco, salario);
        this.bonus = bonus;
    }

    //getters
    public float getBonus() {return bonus;}

    //setters
    public void setBonus(float bonus) {this.bonus = bonus;}

    @Override
    public float calculaSalario() {
        return this.salario + (this.bonus);
    }

    @Override //anula um metodo herdado
    public String toString(){
        return "Gerente{" +
                "bonus=" + bonus +
                super.toString() +
                '}';
    }
}
