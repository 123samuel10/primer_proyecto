package model;

public class Client extends Person{
    private int amount;
    private int price;
    private String product;


    public Client(String name, String age,String product,int amount,int price) {
        super(name, age);
        this.product=product;
        this.amount=amount;
        this.price=price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
