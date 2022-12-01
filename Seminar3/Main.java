import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import data.*;

/**
 * 1. Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий
 * интерфейс Iterable.
 */
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        StudyGroup myNewGroup = new StudyGroup();
        myNewGroup = myNewGroup.generateStudyGroup("teacher.txt", "students.txt");

        StudyGroup myNewGroup2 = new StudyGroup();
        myNewGroup2 = myNewGroup2.generateStudyGroup("teacher1.txt", "students1.txt");

        ArrayList<StudyGroup> firstGroup = new ArrayList<>(Arrays.asList(myNewGroup, myNewGroup2));

        Stream firstStream = new Stream(firstGroup);

        logger.info(firstStream.toString());

    }
}
