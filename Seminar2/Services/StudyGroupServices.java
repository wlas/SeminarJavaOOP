package Services;

import java.util.ArrayList;

import data.StudyGroup;

public interface StudyGroupServices {

    public StudyGroup generateStudyGroup(String teacherPath, String studentPath);

    ArrayList<String> getNames(String path);

}
