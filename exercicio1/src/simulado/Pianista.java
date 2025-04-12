package simulado;

public class Pianista extends Musico{
    private Boolean tecladoDigital;

    //construtor vazio
    public Pianista(){
        super();

    }

    //construtor
    public Pianista(String nome, int idade, Boolean tecladoDigital) {
        super(nome, idade);
        this.tecladoDigital = tecladoDigital;
    }

    //obrigatoria pois é abstract na classe pai
    @Override
    public String tocar(){
        return this.tecladoDigital ?
                "Pianista tocando teclado digital":
                "Pianista tocando teclado acustico";
    }

    //getters
    public Boolean getTecladoDigital() {
        return tecladoDigital;
    }

    //setters
    public void setTecladoDigital(Boolean tecladoDigital) {
        this.tecladoDigital = tecladoDigital;
    }

    //toString
    @Override
    public String toString() {
        return "Pianista{" +
                super.toString() +
                "tecladoDigital=" + tecladoDigital +
                '}';
    }
}
