package Webinar2.task003;

public class Car implements Transport {

    @Override
    public void start() {
        System.out.println("Машина едет.");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась.");
    }
}
