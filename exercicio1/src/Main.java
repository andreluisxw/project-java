import simulado.*;

public class Main {
    public static void main(String[] args){
        Guitarrista g1 = new Guitarrista("Dedé", 21, "Eletrica");
        Baterista b1 = new Baterista("Lelek", 20, 5);
        Pianista p1 = new Pianista("kelton", 20, true);

        //cria um recital
        Recital r1 = new Recital("Feriado de Pascoa");

        //adiciona os musicos
        r1.addMusico(g1);
        r1.addMusico(b1);
        r1.addMusico(p1);

         System.out.println(r1.resumeRecital());

    }
}