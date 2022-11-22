import java.util.logging.Logger;

/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 */
public class Main {

    private static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {

        TeaDrink tea = new TeaDrink("Черный чай", 95);
        logger.info(String.valueOf(tea));
    }
}