package data;

import Services.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudyGroup implements StudyGroupServices {

    private Teacher teacher = new Teacher();
    private List<Student> listStudent = new ArrayList<>();

    public StudyGroup() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student());
        this.teacher = new Teacher();
        this.listStudent = list;
    }

    public StudyGroup(String teacher, List<String> students) {
        Student studentOd = new Student();
        for (String studentName : students) {
            studentOd = new Student(studentName);
            this.listStudent.add(studentOd);
        }
        if (this.listStudent.size() == 0) {
            this.listStudent.add(studentOd);
        }
        this.teacher = new Teacher(teacher);
    }

    @Override
    public StudyGroup generateStudyGroup(String teacherPath, String studentPath) {
        String teacherName = getNames(teacherPath).get(0);

        ArrayList<String> studentArrayList = getNames(studentPath);
        System.out.println(studentArrayList.get(0));
        return new StudyGroup(teacherName, studentArrayList);
    }

    @Override
    public ArrayList<String> getNames(String path) {
        ArrayList<String> names = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                names.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (names.size() == 0) {
            names.add("");
        }
        return names;
    }

    @Override
    public String toString() {
        StringBuilder toStirngBuilder = new StringBuilder();

        toStirngBuilder.append("Teacher " + this.teacher);
        toStirngBuilder.append(" Students ");

        for (int i = 0; i < this.listStudent.size() - 1; i++) {
            toStirngBuilder.append(this.listStudent.get(i));
        }

        if (this.listStudent.size() == 0) {
            toStirngBuilder.append("----");
            return toStirngBuilder.toString();
        }
        toStirngBuilder.append(this.listStudent.get(this.listStudent.size() - 1));
        return toStirngBuilder.toString();

    }

}
