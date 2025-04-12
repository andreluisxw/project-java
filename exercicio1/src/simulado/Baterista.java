package simulado;

public class Baterista extends Musico {
    private int numeroDeTambores;

    //obrigatoria pois é abstract na classe pai
    @Override
    public String tocar(){
        return "Baterista fazendo batida com " + this.numeroDeTambores;
    }

    //construtor vazio
    public Baterista(){
        super();
    }

    //construtor
    public Baterista(String nome, int idade, int numeroDeTambores) {
        super(nome, idade);
        this.numeroDeTambores = numeroDeTambores;
    }

    //getters
    public int getNumeroDeTambores() {
        return numeroDeTambores;
    }

    //setters
    public void setNumeroDeTambores(int numeroDeTambores) {
        this.numeroDeTambores = numeroDeTambores;
    }

    //toString
    @Override
    public String toString() {
        return "Baterista{" +
                super.toString() +
                "numeroDeTambores=" + numeroDeTambores +
                '}';
    }
}
