import java.util.ArrayList;

public class HotDrinksVendingMachine implements HotDrinkMachine{

    private ArrayList<HotDrinkHeir> drinks = new ArrayList<>();

    public HotDrinksVendingMachine(HotDrinkHeir[] drinks){
        for (HotDrinkHeir hotDrinkHeir : drinks) {
            this.drinks.add(hotDrinkHeir);
        }
    }

    @Override
    public HotDrinkHeir getProduct(String name, Double volume, int temperature) {
        for (int i = 0; i < drinks.size(); i++) {
            
            if (drinks.get(i).name.equals(name) && drinks.get(i).volume.equals(volume) && drinks.get(i).temperature==(temperature)) {
                return drinks.get(i);
            }
        }
        return new HotDrinkHeir("Пусто",0d,0);
    }
    
}
