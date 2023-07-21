package Webinar5.task002.Controller;

import java.util.List;

import Webinar5.task002.Model.Student;
import Webinar5.task002.Model.Type;
import Webinar5.task002.Model.User;
import Webinar5.task002.Service.UserSevice;
import Webinar5.task002.View.StudentView;

public class Controller {
    private final UserSevice service = new UserSevice();
    private final StudentView view = new StudentView();

    public void createStudent(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            view.printConsole((Student) user);
        }
    }
}
