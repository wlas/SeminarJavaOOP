package data;

public class Student extends User {

    public Student(String name) {
        super.setName(name);
    }

    public Student() {
        super.name = "Default student";
    }

    @Override
    public String toString() {
        return "ФИО: " + super.getName();
    }

}
