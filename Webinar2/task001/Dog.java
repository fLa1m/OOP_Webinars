package Webinar2.task001;

public class Dog extends Animal {

    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Dog() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void animalInfo() {
        System.out.println("собака: ");
    }

    @Override
    public void voice() {
        System.out.println("гав-гав");
    }

}
