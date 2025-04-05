package rh;

public class Assistente extends Funcionario{
    private float horaExtra;

    //construtor sem parametros
    public Assistente(){
        super(); //chama o construtor da superclasse ou classe pai
    }

    //construtor


    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    //getter
    public float getHoraExtra() {return horaExtra;}

    //setter
    public void setHoraExtra(float horaExtra) {this.horaExtra = horaExtra;}

    @Override
    public float calculaSalario() {
        return this.salario + (this.horaExtra * 30);
    }

    @Override //anula um metodo herdado
    public String toString(){
        return super.toString()+
                "\nHoraExtra: " + horaExtra;
    }
}

