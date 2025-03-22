package exe0;

import java.util.*;

public class ShoppingCart {
    private int id;
    private Date date;
    private float finalPrice;
    private String address;
    private List<Caritem> carItens;

    public ShoppingCart() {
        this.date = new Date();
        this.address = "no addres";
        //aloca espaço na memoria pro vetor
        this.carItens = new ArrayList<Caritem>();

    }

    public ShoppingCart(int id, String address) {
        this.setId(id);
        this.date = new Date();
        this.setAddress(address);
        this.carItens = new ArrayList<Caritem>();
    }

    //getters
    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public String getAddress() {
        return address;
    }

    public List getCarItens() {
        return carItens;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // nao pode ser implementado pois estamos em uma composição

    /*public void setCarItens(List carItens) {
        this.carItens = carItens;
    }*/

    public void addCarItem(int id, float quantity, Product product){
        this.carItens.add(new Caritem(id, quantity, product));
        this.calculateFinalPrice();
    }

    public void calculateFinalPrice(){
        double soma = 0;
        //percorre o vetor
        for(Caritem obj: this.carItens){
            soma += obj.getProduct().getPrice() * obj.getQuantity();
        }
        this.finalPrice = (float) soma;

    }

    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", date=" + date +
                ", finalPrice=" + finalPrice +
                ", address='" + address + '\'' +
                ", carItens=\n" + carItens +
                '}';
    }
}