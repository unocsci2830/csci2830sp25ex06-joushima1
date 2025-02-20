package pizza.topping;

public class ProvoloneTopping extends CheeseTopping {
    @Override
    public String toString() {
        return "Provolone Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
