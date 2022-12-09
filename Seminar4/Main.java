import java.util.concurrent.ConcurrentHashMap;

import controller.Controller;

/**
 * Спроектировать и реализовать планировщик дел для работы с задачами разных
 * приоритетов.
 * Например:
 * определить уровень приоритетов: низкий, средний, немедленное выполнение
 * выделить компоненту для хранения данных
 * выделить компоненту для организации импорта\экспорта данных
 * Файл должен содержать следующие данные: id, дату добавления записи, время
 * добавления записи, дедлай задачи, ФИО автора,
 * данные хранятся в файле csv/jsom/xml
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.execute();
    }
}