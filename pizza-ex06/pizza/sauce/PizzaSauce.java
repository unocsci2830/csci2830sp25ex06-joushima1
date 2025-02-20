package pizza.sauce;

import pizza.topping.PizzaTopping;

public abstract class PizzaSauce extends PizzaTopping {
    public abstract String toString();

    public String toNiceString() {
        return "Sauce: " + this.toString() + " $" + this.getPrice();
    }
}
