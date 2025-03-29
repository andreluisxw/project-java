package exe1;

public class Emprestimo {
    private int id;
    private int DiasEmprestimo;

    //construtor


    public Emprestimo(int id, int diasEmprestimo) {
        this.id = id;
        this.DiasEmprestimo = diasEmprestimo;
    }

    //getters
    public int getId() {return id;}

    public int getDiasEmprestimo() {return DiasEmprestimo;}

    //setters

    public void setId(int id) {this.id = id;}

    public void setDiasEmprestimo(int diasEmprestimo) {DiasEmprestimo = diasEmprestimo;}
}
