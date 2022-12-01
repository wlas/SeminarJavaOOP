import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import Services.StreamComparator;
import Services.StreamService;
import data.*;

/**
 * 1. Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий
 * интерфейс Iterable.
 * 2. Создать класс StreamComparator, реализующий сравнение количества групп
 * входящих в Поток.
 * 3. Создать класс ПотокСервис, добавив в него метод сортировки списка потоков,
 * используя созданный StreamComparato.
 */
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        StudyGroup myNewGroup = new StudyGroup();
        myNewGroup = myNewGroup.generateStudyGroup("teacher.txt", "students.txt");

        StudyGroup myNewGroup2 = new StudyGroup();
        myNewGroup2 = myNewGroup2.generateStudyGroup("teacher1.txt", "students1.txt");

        StudyGroup myNewGroup3 = new StudyGroup();
        myNewGroup3 = myNewGroup3.generateStudyGroup("teacher2.txt", "students2.txt");

        ArrayList<StudyGroup> group1 = new ArrayList<>(Arrays.asList(myNewGroup, myNewGroup2));
        ArrayList<StudyGroup> group2 = new ArrayList<>(Arrays.asList(myNewGroup, myNewGroup2, myNewGroup));
        ArrayList<StudyGroup> group3 = new ArrayList<>(Arrays.asList(myNewGroup3));

        Stream stream1 = new Stream(group1);
        Stream stream2 = new Stream(group2);
        Stream stream3 = new Stream(group3);

        logger.info(String.format("Stream 1 > Stream 2: %s", StreamComparator.compareStreams(stream1, stream2)));

        Stream[] toSort = { stream1, stream2, stream3 };

        logger.info(Stream.arrayTostring(toSort));
        sortStream(toSort);
    }

    public static Stream[] sortStream(Stream[] streamsToSort) {
        StreamService streamList = new StreamService(streamsToSort);
        streamList.sortStreams();

        return streamList.streamArray;

    }
}
