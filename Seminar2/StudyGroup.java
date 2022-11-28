import java.util.List;

public class StudyGroup {

    private Teacher teacher;
    private List<Student> listStudent;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.listStudent = students;
    }

}
