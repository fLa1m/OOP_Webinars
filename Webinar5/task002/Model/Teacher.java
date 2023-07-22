package Webinar5.task002.Model;

public class Teacher extends User {
    int teacherId;

    public Teacher(String name, String surname, String patron, int teacherId) {
        super(name, surname, patron);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + " Name=" + super.name + " Surname=" + super.surname + " Patron="
                + super.patron + "]";
    }

}
