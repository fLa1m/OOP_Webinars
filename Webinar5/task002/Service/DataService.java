package Webinar5.task002.Service;

import java.util.List;

import Webinar5.task002.Model.Type;
import Webinar5.task002.Model.User;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();

    List<User> readOnlyStudent();

    List<User> readOnlyTeacher();

    void delete(int id, Type type);

    void update(int id, String name, String surname, String patron, Type type);
}
