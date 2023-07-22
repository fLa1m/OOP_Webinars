package Webinar5.task002.Controller;

import java.util.List;

import Webinar5.task002.Model.Student;
import Webinar5.task002.Model.Teacher;
import Webinar5.task002.Model.Type;
import Webinar5.task002.Model.User;
import Webinar5.task002.Service.UserSevice;
import Webinar5.task002.View.View;

public class Controller {
    private final UserSevice service = new UserSevice();
    private final View view = new View();

    public void createStudent(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void createTeacher(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.TEACHER);
    }

    public void getAllStudents() {
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            view.printConsole((Student) user);
        }
    }

    public void getAllTeachers() {
        List<User> teacherList = service.readOnlyTeacher();
        for (User user : teacherList) {
            view.printConsole((Teacher) user);
        }
    }

    public void deleteUser(int id, Type type) {
        service.delete(id, type);
    }

    public void getUsers() {
        List<User> userList = service.read();
        for (User user : userList) {
            view.printConsole(user);
        }
    }

    public void updateStudent(int id, String name, String surname, String patron) {
        service.update(id, name, surname, patron, Type.STUDENT);
    }

    public void updateTeacher(int id, String name, String surname, String patron) {
        service.update(id, name, surname, patron, Type.TEACHER);
    }

}
