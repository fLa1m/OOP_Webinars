package Webinar2.task003;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        human.stop();
        human.drive(bicycle);
        human.stop();
        human.drive(car);
        human.drive(bicycle);
        human.stop();
    }
}
