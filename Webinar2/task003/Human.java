package Webinar2.task003;

public class Human {
    private Transport curreTransport;

    public void drive(Transport transport) {
        curreTransport = transport;
        transport.start();
    }

    public void stop() {
        if (curreTransport != null) {
            curreTransport.stop();
            curreTransport = null;
        } else {
            System.out.println("Не едем.");
        }
    }
}
