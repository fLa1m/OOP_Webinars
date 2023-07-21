package Webinar5.task002.Service;

import java.util.ArrayList;
import java.util.List;

import Webinar5.task002.Model.Student;
import Webinar5.task002.Model.Teacher;
import Webinar5.task002.Model.Type;
import Webinar5.task002.Model.User;

public class UserSevice implements DataService {

    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, String patron, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surname, patron, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surname, patron, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        if (userList.size() > 0) {
            for (User user : userList) {
                if (user instanceof Teacher && !isStudent) {
                    lastId++;
                }
                if (user instanceof Student && isStudent) {
                    lastId++;
                }
            }
            return ++lastId;
        }
        return 1;
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readOnlyStudent() {
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                students.add(user);
            }
        }
        return students;
    }

}
