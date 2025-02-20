package pizza.topping;

public class MushroomTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Mushroom Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
