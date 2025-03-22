package exe0;

public class Caritem {
    private int id;
    private float quantity;
    // associação todo-parte
    private Product product;

    public Caritem(){

    }
    //Product ja esta criado, associação fraca
    //agregação
    public Caritem(int id, float quantity, Product product){
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    //getters
    public int getId(){return this.id;}
    public float getQuantity(){return this.quantity;}
    public Product getProduct(){return product;}

    //setters
    public void setId(int id){this.id = id;}
    public void setQuantity(float quantity){this.quantity = quantity;}
    public void setProduct(Product product){this.product = product;}

    public String toString() {
        return "\nCaritem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
