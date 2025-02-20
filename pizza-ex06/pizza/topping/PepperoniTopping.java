package pizza.topping;

public class PepperoniTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Pepperoni Topping";
    }

    @Override
    public Double getPrice() {
        return 1.50;
    }
}