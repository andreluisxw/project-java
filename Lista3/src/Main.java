import exe0.*;

public class Main {
    public static void main(String[] args) {
        //crie 2 produtos
        exe0.Product prod1 = new exe0.Product(1, "raquete", 300);
        exe0.Product prod2 = new exe0.Product(2, "bolinha", 10);

        // crie 1 item de carrinho
        //Caritem ci1 = new Caritem(11, 20, prod1);
        //Caritem ci2 = new Caritem(12, 10, prod2);
        //System.out.println(ci1.exibeCaritem());
        //System.out.println(ci2.exibeCaritem());

        ShoppingCart sc1 = new ShoppingCart(111, "Franca");
        sc1.addCarItem(12, 5, prod1);
        sc1.addCarItem(12, 10, prod2);

        System.out.println(sc1.toString());

    }
}