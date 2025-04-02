package exercicio1;

public class Aluno {

    //Variáveis primitivas
    public int numeroAluno;
    public int idade;
    public float p1, p2;

    //Variáveis classes
    public String nome;

    public Aluno(){
        this.nome = "Sem nome";
    }

    public Aluno(int numeroAluno, int idade, float p1, float p2, String nome) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    public String dadosAluno() {
        return "==================\nNumero aluno: " + this.numeroAluno + "\nNome Aluno: " + this.nome + "Idade: " + this.idade;
    }

    public boolean passou(){
        return (this.notaFinal() >= 5.0);
    }
}
