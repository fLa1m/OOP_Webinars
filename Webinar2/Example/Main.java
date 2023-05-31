package Webinar2.Example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 21, true, "Moscow");
        Teacher teacher = new Teacher("Sergei", "Vlasov", 34, "Vladivostok");
        student.tellInfo();
        System.out.println(student.isWorking());
        System.out.println(student.getPlaceOfLiving());
        teacher.tellInfo();
        System.out.println(teacher.getPlaceOfLiving());
    }
}
