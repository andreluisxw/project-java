import javax.swing.*;

public class MainCarro {
    public static void main(String[] args) {
        //Criação dos objetos que estão sempre relacionados a uma classe
        exercicio0.Carro obj1 = new exercicio0.Carro();
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano"));
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a Velocidade"));
        obj1.marca = JOptionPane.showInputDialog("Informa a Marca:");
        obj1.modelo = JOptionPane.showInputDialog("Informa o Modelo");
        obj1.exibirDetalhes();
        obj1.acelerar(45);
        obj1.frear(15);
        obj1.exibirDetalhes();

        exercicio0.Carro obj2 = new exercicio0.Carro(2015, 45, "Renault", "Clio");
        obj2.acelerar(45);
        obj2.exibirDetalhes();
        obj2.frear(100);
    }
}