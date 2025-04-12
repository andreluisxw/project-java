package simulado;

public class Guitarrista extends Musico {
    private String tipoGuitarra;

    //obrigatoria pois é abstract na classe pai
    @Override
    public String tocar() {
        return "Guitarrista tocando solo de guitarra elétrica";
    }

    //construtor vazio
    public Guitarrista(){
        super();
        this.tipoGuitarra = "Sem tipo";
    }

    //construtor
    public Guitarrista(String nome, int idade, String tipoGuitarra) {
        super(nome, idade);
        this.tipoGuitarra = tipoGuitarra;
    }

    //getters
    public String getTipoGuitarra() {return tipoGuitarra;}

    //setters
    public void setTipoGuitarra(String tipoGuitarra) {this.tipoGuitarra = tipoGuitarra;}

    @Override
    public String toString() {
        return "Guitarrista{" +
                super.toString() +
                "tipoGuitarra='" + tipoGuitarra + '\'' +
                '}';
    }
}
