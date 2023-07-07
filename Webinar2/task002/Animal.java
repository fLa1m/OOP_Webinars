package Webinar2.task002;

public class Animal {
    protected String name;
    protected String type;
    protected static int count;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.type = type;
        if (type.equals("Cat")) {
            if (maxRunDistance > 200) {
                this.maxRunDistance = 200;
                this.maxSwimDistance = maxSwimDistance;
            }
        } else {
            if (maxRunDistance > 500) {
                this.maxRunDistance = 500;
            }
            if (maxSwimDistance > 10) {
                this.maxSwimDistance = 10;
            }
        }

        count++;
    }

    public Animal() {

    }

    protected void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println("Животное - " + name + " - пробежало дистанцию: " + dist + " км.");
        } else {
            System.out.println("Животное - " + name + " - НЕ пробежало дистанцию: " + dist + " км.");
        }
    }

    protected void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println("Животное - " + name + " - проплыло дистанцию: " + dist + " км.");
        } else {
            System.out.println("Животное - " + name + " - НЕ проплыло дистанцию: " + dist + " км.");
        }
    }
}
