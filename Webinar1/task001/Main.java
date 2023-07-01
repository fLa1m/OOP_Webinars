package Webinar1.task001;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik", "orange", -3);
        cat1.setAge(-5);
        cat1.setAge(10);
        cat1.animalInfo();
        cat1.voice();
        cat1.jump();
    }
}
