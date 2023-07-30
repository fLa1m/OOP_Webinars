package Webinar7.DecoratorFactory;

public class ConsoleLogger implements Logable {

    @Override
    public void log(String message) {
        System.out.println("LOG : " + message);
    }

}
