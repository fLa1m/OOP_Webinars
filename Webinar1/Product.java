package Webinar1;

public abstract class Product {
    protected String name;
    protected Integer price;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract Integer getPrice();

    public abstract void setPrice(Integer price);

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}
