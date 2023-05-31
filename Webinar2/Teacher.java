package Webinar2;

public class Teacher extends Human {

    public Teacher(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    @Override
    public void tellInfo() {
        System.out.println("Привет! Меня зовут " + name + " " + lastName + ". Мне " + age
                + " и я учитель.");
    }

}
