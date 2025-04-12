package simulado;
import java.util.ArrayList;
import java.util.List;

public class Recital {
    private String tema;
    //associacao
    private List<Musico> musicos;

    //construtor vazio
    public Recital(){
        this.tema = "sem tema";
        //aloca espaço na memoria pro vetor
        this.musicos = new ArrayList<Musico>();
    }

    //construtor
    public Recital(String tema) {
        this.tema = tema;
        //aloca espaço na memoria pro vetor
        this.musicos = new ArrayList<Musico>();
    }

    //getters
    public String getTema() {
        return tema;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    //setters
    public void setTema(String tema) {
        this.tema = tema;
    }

    //adiciona um musico no recital
    public void addMusico(Musico musico){
        this.musicos.add(musico);
    }

    public void apresentarTodos(){
        for(Musico obj: this.musicos){
            //polimorfismo -> obj vai executar tocar de classes diferentes
            System.out.println(obj.tocar());
        }
    }

    //aprensenta o recital dos musicos e depois exibe o resumo
    public String resumeRecital(){
        this.apresentarTodos();
        return "Quantidade de musicos " + this.musicos.size() +
                "\nTema: " + this.tema;
    }
}
