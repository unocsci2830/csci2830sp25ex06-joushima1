package pizza.topping;

public class SpinachTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Spinach Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
