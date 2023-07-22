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

    @Override
    public List<User> readOnlyTeacher() {
        List<User> teacher = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher) {
                teacher.add(user);
            }
        }
        return teacher;
    }

    @Override
    public void delete(int id, Type type) {
        for (int i = 0; i < userList.size(); i++) {
            if (type == Type.STUDENT) {
                if (userList.get(i) instanceof Student && ((Student) userList.get(i)).getStudentId() == id) {
                    userList.remove(i);
                }
            }
            if (type == Type.TEACHER) {
                if (userList.get(i) instanceof Teacher && ((Teacher) userList.get(i)).getTeacherId() == id) {
                    userList.remove(i);
                }
            }
        }
    }

    @Override
    public void update(int id, String name, String surname, String patron, Type type) {
        for (int i = 0; i < userList.size(); i++) {
            if (type == Type.STUDENT) {
                if (userList.get(i) instanceof Student && ((Student) userList.get(i)).getStudentId() == id) {
                    Student newUser = new Student(name, surname, patron, id);
                    userList.set(i, newUser);
                }
            }
            if (type == Type.TEACHER) {
                if (userList.get(i) instanceof Teacher && ((Teacher) userList.get(i)).getTeacherId() == id) {
                    Teacher newUser = new Teacher(name, surname, patron, id);
                    userList.set(i, newUser);
                }
            }
        }
    }

}
