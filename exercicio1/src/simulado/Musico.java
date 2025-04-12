package simulado;

abstract class Musico {
    protected String nome;
    protected int idade;

    //construtor sem parametros
    public Musico(){
        this.nome= "Sem nome";
    }

    //construtor
    public Musico(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //getters
    public String getNome() {return nome;}

    public int getIdade() {return idade;}

    //setters
    public void setNome(String nome) {this.nome = nome;}

    public void setIdade(int idade) {this.idade = idade;}

    //funcao tocar
    public abstract String tocar();

    //toString
    @Override
    public String toString() {
        return "Musico{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
