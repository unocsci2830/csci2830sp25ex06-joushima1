package pizza.crust;

import pizza.topping.PizzaTopping;

public abstract class PizzaCrust extends PizzaTopping {
    protected String ingredient;

    public PizzaCrust() {
        this.ingredient = "";
    }

    public abstract String toString();

    public String toNiceString() {
        return "Crust: " + this.toString() + ", Made from: " + this.ingredient + " $" + this.getPrice();
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String checkIntegrity() {
        return "";
    }
}
