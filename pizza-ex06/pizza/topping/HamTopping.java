package pizza.topping;

public class HamTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Ham Topping";
    }

    @Override
    public Double getPrice() {
        return 1.50;
    }
}
