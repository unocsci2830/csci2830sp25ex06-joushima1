package pizza.topping;

public class MozzarellaTopping extends CheeseTopping {
    @Override
    public String toString() {
        return "Mozzarella Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
