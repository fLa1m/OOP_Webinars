package Webinar1;

public class WaterBottle extends Product {

    public WaterBottle(String name, Integer price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Integer getPrice() {
        return super.price;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setPrice(Integer price) {
        super.price = price;
    }

}
