package exe0;

public class Product {
    private int id;
    private String description;
    private double price;

    public Product(){
        this.description = "sem descricao";
    }

    public Product(int id, String description, double price){
        this.setId(id);
        this.setDescription(description);
        this.setPrice(price);
    }

    //getters
    public int getId(){return this.id;}
    public String getDescription(){return this.description;}
    public double getPrice(){return this.price;}

    //setters
    public void setId(int id){this.id = id;}
    public void setDescription(String description){this.description = description;}
    public void setPrice(double price){this.price = price;}


    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }


}
