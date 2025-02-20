package pizza.topping;

public class ArtichokeTopping extends VeggieTopping {
    @Override
    public String toString() {
        return "Artichoke Topping";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
