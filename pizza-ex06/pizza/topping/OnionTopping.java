package pizza.topping;

public class OnionTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Onion Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
