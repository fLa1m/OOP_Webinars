package Webinar2.task003;

public class Bicycle implements Transport {

    @Override
    public void start() {
        System.out.println("Велосипед едет.");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился.");
    }

}
