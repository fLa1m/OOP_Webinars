package Webinar5.task002;

import Webinar5.task002.Controller.Controller;
import Webinar5.task002.Model.Type;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("Andrew", "Mokin", "Arcadievich");
        controller.createTeacher("Diana", "Mokina", "Aleksandrovna");
        controller.createStudent("Polina", "Mokina", "Andreevna");
        controller.createStudent("Ivan", "Mokin", "Andreevich");
        controller.getUsers();
        System.out.println("----");
        controller.getAllStudents();
        System.out.println("----");
        controller.getAllTeachers();
        controller.deleteUser(1, Type.TEACHER);
        System.out.println("----");
        controller.getAllTeachers();
        controller.updateTeacher(2, "Diana", "Perepelitsa", "Aleksandrovna");
        System.out.println("----");
        controller.getAllTeachers();
    }
}
