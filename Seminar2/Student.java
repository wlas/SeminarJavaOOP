
public class Student extends User {
    private Integer studentId;

    public Student(Integer studentId, String name) {
        super.setName(name);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Студент с ID: " + studentId + " ФИО:" + super.getName();
    }

    
}
