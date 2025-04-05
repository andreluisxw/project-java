import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void mostraDadosDetalhados(Funcionario obj){
        System.out.println(obj.toString() + "salario final " + obj.calculaSalario());
    }

    public static void main(String[] args) {

        Assistente a1 = new Assistente("Lekek", "Franca", "447.315.528-50", 3000, 10);
            mostraDadosDetalhados(a1);

        Gerente g1 = new Gerente("Pedro", "SJB", "456", 5000, 2000);
            mostraDadosDetalhados(g1);

        Diretor d1 = new Diretor("Vittor", "Claraval", "789", 7000, 1000);
            mostraDadosDetalhados(d1);

        //vetor de funcionarios
        List<Funcionario> vetor = new ArrayList<Funcionario>();

        //adiciona no vetor
        vetor.add(a1);
        vetor.add(g1);
        vetor.add(d1);

        //calcula folha de pagamento
        float folha = 0;
        for (Funcionario f : vetor ){
            folha += f.calculaSalario();
        }
        System.out.println(folha);

    }
}