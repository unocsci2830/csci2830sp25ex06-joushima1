package pizza.topping;

public class SausageTopping extends MeatTopping {
    @Override
    public String toString() {
        return "Sausage Topping";
    }

    @Override
    public Double getPrice() {
        return 1.50;
    }
}
