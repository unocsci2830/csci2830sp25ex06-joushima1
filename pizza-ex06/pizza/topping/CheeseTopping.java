package pizza.topping;

//import pizza.topping.PizzaTopping;

public class CheeseTopping extends PizzaTopping {
    @Override
    public String toString() {
        return "Cheese Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
