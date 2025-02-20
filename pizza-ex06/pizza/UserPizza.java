package pizza;

import java.util.ArrayList;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

public class UserPizza implements MenuItem {
    // NEEDTO create instance variables of PizzaCrust, PizzaSauce, and a max of 4
    // topping selections
    private PizzaCrust crust;
    private PizzaSauce sauce;
    // followed example from in-class, changing from an array of strings to an
    // arrayList of toppings
    private ArrayList<PizzaTopping> toppingList;

    public UserPizza(PizzaCrust crust, PizzaSauce sauce, ArrayList<PizzaTopping> toppingList) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppingList = toppingList;
    }

    public PizzaCrust getCrust() {
        return this.crust;
    }

    public PizzaSauce getSauce() {
        return this.sauce;
    }

    public ArrayList<PizzaTopping> getToppings() {
        return this.toppingList;
    }

    ArrayList<MenuItem> MenuItems = new ArrayList<>();

    // test this
    public void addMenuItem(MenuItem item) {
        MenuItems.add(item);
    }

    // try changin calculatePrice to getPrice with the Override above : works!!!
    @Override
    public Double getPrice() {
        Double price = 0.00;
        for (MenuItem item : MenuItems) {
            price += item.getPrice();
        }
        return price;
    }
}