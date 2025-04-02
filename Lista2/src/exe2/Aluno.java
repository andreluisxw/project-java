package exe2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    // Construtor sem argumentos
    public Aluno() {
        this.numeroAluno = 000000;
        this.nome = "Aluno Padrão";
        this.idade = 18;
        this.p1 = 0.0f;
        this.p2 = 0.0f;
    }

    // Construtor com argumentos
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        setNumeroAluno(numeroAluno);
        setNome(nome);
        setIdade(idade);
        setP1(p1);
        setP2(p2);
    }

    // Getters e Setters
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        if (String.valueOf(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Número de aluno inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("Nota P1 inválida.");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("Nota P2 inválida.");
        }
    }

    // Métodos de cálculo e impressão
    public void notaFinal() {
        float media = (this.p1 + this.p2) / 2;
        System.out.println("Média Final: " + media);
    }

    public void dadosAluno() {
        System.out.println("Número do Aluno: " + this.numeroAluno);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
