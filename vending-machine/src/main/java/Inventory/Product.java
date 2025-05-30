package Inventory;

public class Product {
    private String name;
    private int id;
    private double price;

    public Product(){}

    public Product(String name, int id, double price){
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int productId){
        this.id = productId;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
