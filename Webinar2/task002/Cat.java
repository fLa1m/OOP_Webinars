package Webinar2.task002;

public class Cat extends Animal {

    protected static int count;

    public Cat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Cat", maxRunDistance, 0);
        count++;
    }
}
