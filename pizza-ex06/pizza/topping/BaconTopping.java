package pizza.topping;

public class BaconTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Bacon Topping";
    }

    @Override
    public Double getPrice() {
        return 1.50;
    }
}
