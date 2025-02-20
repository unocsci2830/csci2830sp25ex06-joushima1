package pizza.crust;

public class ThinCrust extends PizzaCrust {
    @Override
    public String toString() {
        return "Thin Crust";
    }

    @Override
    public Double getPrice() {
        return 2.50;
    }
}
