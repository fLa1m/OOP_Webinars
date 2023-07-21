package Webinar5.task001;

public class Outer {

    static class Inner1 {// вложенный класс, пропадает видимость outer

    }

    class Inner {// внутренний класс
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(outerValue);
            System.out.println(innerValue);
            outerMethod();
        }
    }

    int outerValue;

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer() {
    }

    public void outerMethod() {
        System.out.println(outerValue);
        // System.out.println(innerValue);
        // innerMethod();
    }

    public static void main(String[] args) {
        // Внутренний класс нельзя создать без внешнего
        // Inner inner = new Inner(5);
        Inner inner = new Outer().new Inner(10);

        class Point {// локальный класс, при единоразовом использовании в методе
            int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Point{" + "x=" + x + "}";
            }
        }

        Point point = new Point(3);
        System.out.println(point);

        Flyable flyable = new Flyable() {
            // new Flyable() ->
            // Outer implements Flyable ->
            // происходит @Override методов ->
            // Outer flyable = new Outer();

            @Override
            public void fly() {
                System.out.println("fly");
            }

        };
        flyable.fly();
    }

}
