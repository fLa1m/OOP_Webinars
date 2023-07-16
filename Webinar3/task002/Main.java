package Webinar3.task002;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;

        switch (fruit) {
            case APPLE:
                System.out.println("Яблоко.");
                break;
            case ORANGE:
                System.out.println("Апельсин.");
                break;
            case PEACH:
                System.out.println("Персик.");
                break;
            default:
                System.out.println("Фрукта нет.");
                break;
        }
    }
}
