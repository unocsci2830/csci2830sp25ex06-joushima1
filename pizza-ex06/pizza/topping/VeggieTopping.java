
package pizza.topping;

//import pizza.topping.PizzaTopping;

class VeggieTopping extends PizzaTopping {
    @Override
    public String toString() {
        return "Veggie Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
