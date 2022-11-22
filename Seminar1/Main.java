import java.util.logging.Logger;

/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 */
public class Main {

    private static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {

        HotDrinkHeir tea = new HotDrinkHeir("Черный чай", 0.25d, 95);

        HotDrinkHeir[] dr = {tea};

        HotDrinksVendingMachine machine = new HotDrinksVendingMachine(dr);


        logger.info(String.valueOf(machine.getProduct("Черный чай", 0.25d, 95)));
    }
}