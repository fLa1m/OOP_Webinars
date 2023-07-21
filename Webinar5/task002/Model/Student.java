package Webinar5.task002.Model;

public class Student extends User {

    int studentId;

    public Student(String name, String surname, String patron, int studentId) {
        super(name, surname, patron);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + " Name=" + super.name + " Surname=" + super.surname + " Patron="
                + super.patron + "]";
    }

}
