
public class Teacher extends User {

    private String disciplesTaught;

    public Teacher(String disciplesTaught, String name) {
        super.setName(name);
        this.disciplesTaught = disciplesTaught;
    }

    @Override
    public String toString() {
        return "Учитель ФИО:" + super.getName() + " Дисцеплина: " + disciplesTaught;
    }

}
