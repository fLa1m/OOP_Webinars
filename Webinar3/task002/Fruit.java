package Webinar3.task002;

public enum Fruit {
    APPLE(1), ORANGE(2), PEACH(3);

    private int number;

    private Fruit(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
