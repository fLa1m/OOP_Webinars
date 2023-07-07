package Webinar2.task001;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik", "orange", -3);
        cat1.setAge(-5);
        cat1.setAge(10);
        cat1.animalInfo();
        cat1.voice();
        cat1.jump();
        System.out.println("----");
        Animal cat2 = new Cat();
        ((Cat) cat2).klubok();
        System.out.println("----");
        Animal[] catAndDog = {
                new Cat("qwe", "asd", 21),
                new Dog("pe", "zx", 16)
        };
        for (Animal o : catAndDog) {
            o.voice();
        }
        System.out.println("----");
        for (Animal o : catAndDog) {
            if (o instanceof Cat) {
                ((Cat) o).klubok();
            } else {
                System.out.println("не кот");
            }
            o.voice();
        }
    }
}
