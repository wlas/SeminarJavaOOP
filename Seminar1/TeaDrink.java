public class TeaDrink extends HotDrink {
    
    private Integer temp;

    public TeaDrink(String name, Integer temp){
        super.name = name;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Чайный напиток: Название: \"" + super.name + "\" Температура: " + temp;
    }

    
}
