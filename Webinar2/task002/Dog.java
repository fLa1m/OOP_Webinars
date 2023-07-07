package Webinar2.task002;

public class Dog extends Animal {
    protected static int count;

    public Dog(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Dog", maxRunDistance, maxSwimDistance);
        count++;
    }

}
