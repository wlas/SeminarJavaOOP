package data;

public class Teacher extends User {

    public Teacher(String name) {
        super.setName(name);
    }

    public Teacher() {
        super.name = "Default teacher";
    }

    @Override
    public String toString() {
        return "Учитель ФИО:" + super.getName();
    }

}
