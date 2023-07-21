package Webinar5.task002;

import Webinar5.task002.Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Andrew", "Mokin", "Arcadievich");
        controller.createStudent("Diana", "Mokina", "Aleksandrovna");
        controller.createStudent("Polina", "Mokina", "Andreevna");
        controller.createStudent("Ivan", "Mokin", "Andreevich");
        controller.getAllStudents();
    }
}
