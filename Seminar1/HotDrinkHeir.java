public class HotDrinkHeir extends HotDrink {
    
    protected Integer temperature;

    public HotDrinkHeir(String name, Double volume, Integer temp){
        super.name = name;
        super.volume = volume;
        this.temperature = temp;
    }

    @Override
    public String toString() {
        return "Чайный напиток: Название: \"" + super.name + "\" Объем: " + super.volume +" мл Температура: " + temperature;
    }

    
}
