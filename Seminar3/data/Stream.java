package data;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable {

    public ArrayList<StudyGroup> studentGroups = new ArrayList<>();

    public Stream(ArrayList<StudyGroup> groups) {
        this.studentGroups = groups;
    }

    @Override
    public Iterator iterator() {
        Iterator<StudyGroup> iter = studentGroups.iterator();
        return iter;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        for (StudyGroup studyGroup : studentGroups) {
            sBuilder.append(studyGroup);
        }
        return sBuilder.toString();
    }

    public static String arrayTostring(Stream[] array) {

        StringBuilder text = new StringBuilder();
        text.append("Stream is [");
        int i = 0;
        for (Stream stream : array) {
            text.append(i++ + " " + stream.toString() + " ");
        }

        text.append("].");
        return text.toString();

    }
}
