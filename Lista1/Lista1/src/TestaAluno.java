import exercicio1.Aluno;

public class TestaAluno {
    public static void main(String[] args) {

        // Criando outro objeto Aluno usando o construtor com argumentos
        exercicio1.Aluno aluno2 = new Aluno(1002, 15, 19, 6.0f, "LELEK"); // Chama o construtor Aluno(int, String, int, float, float)

        // Chamada dos métodos e impressão dos resultados para aluno2
        System.out.println("Dados do Aluno 2:");
        System.out.println(aluno2.dadosAluno()); // Chama o método dadosAluno() no objeto aluno2
        System.out.println("Nota Final do Aluno 2: " + aluno2.notaFinal()); // Chama o método notaFinal() no objeto aluno2
        System.out.println("Aluno 2 Passou? " + aluno2.passou()); // Chama o método passou() no objeto aluno2
    }
}