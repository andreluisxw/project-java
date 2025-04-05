package rh;

public class Diretor extends Funcionario{

    private float acoesEmpresa;

    //construtor vazio
    public Diretor() {
        super();
    }

    //construtor
    public Diretor(String nome, String endereco, String cpf, float salario, float acoesEmpresa) {
        super(cpf, nome, endereco, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    //getters
    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    //setters
    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public float calculaSalario(){
        return this.salario + (this.acoesEmpresa * 7.23f)/12;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() +
                "acoesEmpresa=" + acoesEmpresa +
                '}';
    }

}
