package Webinar2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 13);
        Teacher teacher = new Teacher("Sergei", "Vlasov", 34);
        student.tellInfo();
        teacher.tellInfo();
    }
}
