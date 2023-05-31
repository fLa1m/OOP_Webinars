package Webinar2;

public class Student extends Human {

    public Student(String name, String lastName, int age) {
        super(name, lastName, age);

    }

    @Override
    public void tellInfo() {
        System.out.println("Привет! Меня зовут " + name + " " + lastName + ". Мне " + age
                + " и я ученик.");
    }

}
