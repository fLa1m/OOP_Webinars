public class Main {
    public static void main(String[] args) {
        Human h = new Human("Robert");
        Human h2 = new Human("Victor");
        Human h3 = new Human("Julia");
        Human h4 = new Human("Polina");

        Market market = new Market();

        market.acceptToMarket(h);
        market.acceptToMarket(h2);
        market.acceptToMarket(h3);
        market.acceptToMarket(h4);

        market.update();
    }
}
