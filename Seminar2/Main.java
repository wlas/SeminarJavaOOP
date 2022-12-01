import java.util.logging.Logger;
import data.*;

/**
 * 1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список
 * Студентов.
 * 2. Создать класс УчебнаяГруппаСервис, в котором реализована логика чтения
 * Студентов и Преподавателя из файла TXT, создания класса УчебнаяГруппа и
 * возвращения его.
 */
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        StudyGroup myNewGroup = new StudyGroup();

        myNewGroup = myNewGroup.generateStudyGroup("teacher.txt", "students.txt");

        logger.info(myNewGroup.toString());
    }
}
