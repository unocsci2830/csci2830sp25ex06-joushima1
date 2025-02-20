package pizza.crust;

public class RegularCrust extends PizzaCrust {
    private Boolean isDeepDish;

    @Override
    public String toString() {
        return "Regular Crust";
    }

    public Boolean getIsDeepDish() {
        return this.isDeepDish;
    }

    public void setIsDeepDish(Boolean isDeepDish) {
        this.isDeepDish = isDeepDish;
    }

    @Override
    public String toNiceString() {
        return super.toNiceString() + ", Deep Dish: " + this.isDeepDish;
    }

    @Override
    public String checkIntegrity() {
        return this.ingredient.equalsIgnoreCase("Cauliflower")
                ? "WARNING: Handle this crust carefully! It may fall apart."
                : "";

    }

    @Override
    public Double getPrice() {
        return isDeepDish ? 3.00 : 2.00;
    }
}
