import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import Services.StreamComparator;
import data.*;

/**
 * 1. Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий
 * интерфейс Iterable.
 * 2. Создать класс StreamComparator, реализующий сравнение количества групп
 * входящих в Поток.
 */
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        StudyGroup myNewGroup = new StudyGroup();
        myNewGroup = myNewGroup.generateStudyGroup("teacher.txt", "students.txt");

        StudyGroup myNewGroup2 = new StudyGroup();
        myNewGroup2 = myNewGroup2.generateStudyGroup("teacher1.txt", "students1.txt");

        ArrayList<StudyGroup> firstGroup1 = new ArrayList<>(Arrays.asList(myNewGroup, myNewGroup2));
        ArrayList<StudyGroup> firstGroup2 = new ArrayList<>(Arrays.asList(myNewGroup, myNewGroup2, myNewGroup));

        Stream stream1 = new Stream(firstGroup1);
        logger.info(stream1.toString());

        Stream stream2 = new Stream(firstGroup2);

        logger.info(String.format("Stream 1 > Stream 2: %s", StreamComparator.compareStreams(stream1, stream2)));

    }
}
