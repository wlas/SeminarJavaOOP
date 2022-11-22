import java.util.logging.Logger;

/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре.
 * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе.
 */
public class Main {

    private static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {

        HotDrinkHeir tea = new HotDrinkHeir("Черный чай", 0.25d, 95);
        HotDrinkHeir tea1 = new HotDrinkHeir("Зеленый чай", 0.25d, 75);
        HotDrinkHeir tea2 = new HotDrinkHeir("Красный чай", 0.25d, 80);

        HotDrinkHeir[] dr1 = {tea, tea1, tea2};
        HotDrinkHeir[] dr2 = {tea1, tea2};


        HotDrinksVendingMachine machine1 = new HotDrinksVendingMachine(dr1);
        HotDrinksVendingMachine machine2 = new HotDrinksVendingMachine(dr2);


        logger.info(String.valueOf(machine2.getProduct("Красный чай", 0.25d, 80)));
    }
}