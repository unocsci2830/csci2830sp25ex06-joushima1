package pizza.topping;

public class CheddarTopping extends CheeseTopping {
    @Override
    public String toString() {
        return "Cheddar Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
