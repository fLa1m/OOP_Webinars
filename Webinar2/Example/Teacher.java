package Webinar2.Example;

public class Teacher extends Human implements PlaceOfLiving {
    private String city;

    public Teacher(String name, String lastName, int age, String city) {
        super(name, lastName, age);
        this.city = city;
    }

    @Override
    public void tellInfo() {
        System.out.println("Привет! Меня зовут " + name + " " + lastName + ". Мне " + age
                + " и я учитель.");
    }

    @Override
    public String getPlaceOfLiving() {
        return city;
    }

}
