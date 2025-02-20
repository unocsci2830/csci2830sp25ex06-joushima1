package pizza;

import java.util.Scanner;
import pizza.topping.*;
import pizza.crust.*;
import pizza.sauce.*;

import java.util.ArrayList;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // trying switch statement for choosing items
        PizzaCrust crust = null;

        // noticed that i would get an error if the user didn't enter a valid choice,
        // but the prog would
        // keep running and get an error because the toString() was trying to print a
        // null, so putting
        // the inputs and switch cases in a while loop fixed this problem

        while (crust == null) {
            System.out.println("What kind of crust would you like?");
            System.out.println("1 - Thin Crust - $2.50\n2 - Regular Crust - $2.00");
            int crustChoice = input.nextInt();
            input.nextLine(); // need nextLine() for user input to work
            switch (crustChoice) {
                case 1:
                    crust = new ThinCrust();
                    break;
                case 2:
                    crust = new RegularCrust();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            boolean validChoice = false;
            System.out.println("Select crust ingredient:");
            System.out.println("1 - Flour\n2 - Cauliflower");
            while (!validChoice) {
                int ingredientChoice = input.nextInt();
                switch (ingredientChoice) {
                    case 1:
                        crust.setIngredient("Flour");
                        validChoice = true;
                        break;
                    case 2:
                        crust.setIngredient("Cauliflower");
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }

            if (crustChoice == 2) {
                System.out.print("Deep Dish? (Y/N) - extra $1.00:  ");
                validChoice = false; // Declare validChoice again here
                while (!validChoice) {
                    String deepDishChoice = input.next();
                    switch (deepDishChoice) {
                        case "Y":
                        case "y":
                            ((RegularCrust) crust).setIsDeepDish(true);
                            validChoice = true;
                            break;
                        case "N":
                        case "n":
                            ((RegularCrust) crust).setIsDeepDish(false);
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Pick between Y or N");
                    }
                }
            }
        }

        PizzaSauce sauce = null;
        while (sauce == null) {
            System.out.println("What kind of sauce would you like?");
            System.out.println("1 - Tomato Sauce - $1.00\n2 - Alfredo Sauce - $1.50");
            int sauceChoice = input.nextInt();
            input.nextLine();

            switch (sauceChoice) {
                case 1:
                    sauce = new TomatoSauce();
                    break;
                case 2:
                    sauce = new AlfredoSauce();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        System.out.println("How many toppings would you like? (4 max)");
        int numToppings = input.nextInt();
        input.nextLine();

        // makes sure the user can only have 4 toppings max
        if (numToppings > 4) {
            System.out.println("4 toppings max");
            numToppings = 4;
        }
        // doing individual prints for each topping group so it't not confusing
        System.out.println("1 - Pepperoni - $1.50\n2 - Sausage - $1.50\n3 - Bacon - $1.50\n4 - Ham - $1.50");
        System.out.println("5 - Mushroom - $1.00\n6 - Spinach - $1.00\n7 - Onion - $1.00\n8 - Artichoke - $1.00");
        System.out.println("9 - Mozzarella - $1.00\n10 - Parmesan - $1.00\n11 - Provolone - $1.00\n12 - Cheddar - $1.00");

        ArrayList<PizzaTopping> toppingList = new ArrayList<>();
        // for loop to keep entering toppings according to how many they want
        for (int i = 0; i < numToppings; i++) {
            int toppingChoice = input.nextInt();
            input.nextLine();
            // now a switch statement to put the topping choice objects in the topping list
            switch (toppingChoice) {
                // still need to try Boolean validChoice = false; and while (!validChoice)... to
                // get a validChoice?
                case 1:
                    toppingList.add(new PepperoniTopping());
                    break;
                case 2:
                    toppingList.add(new SausageTopping());
                    break;
                case 3:
                    toppingList.add(new BaconTopping());
                    break;
                case 4:
                    toppingList.add(new HamTopping());
                    break;
                case 5:
                    toppingList.add(new MushroomTopping());
                    break;
                case 6:
                    toppingList.add(new SpinachTopping());
                    break;
                case 7:
                    toppingList.add(new OnionTopping());
                    break;
                case 8:
                    toppingList.add(new ArtichokeTopping());
                    break;
                case 9:
                    toppingList.add(new MozzarellaTopping());
                    break;
                case 10:
                    toppingList.add(new ParmesanTopping());
                    break;
                case 11:
                    toppingList.add(new ProvoloneTopping());
                    break;
                case 12:
                    toppingList.add(new CheddarTopping());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        UserPizza p = new UserPizza(crust, sauce, toppingList);

        p.addMenuItem(crust);
        p.addMenuItem(sauce);
        for (MenuItem topping : toppingList) {
            if (topping != null) {
                p.addMenuItem(topping);
            }
        }

        System.out.println("Your pizza:"); // did this because its confusing especially with 0 toppings
        System.out.println(p.getCrust().toNiceString());
        System.out.println(p.getSauce().toNiceString());
        for (PizzaTopping topping : p.getToppings()) {
            if (topping != null) {
                System.out.println(topping.toNiceString());
            }
        }

        System.out.println(p.getCrust().checkIntegrity());
        // prints the total price of pizza
        Double totalPrice = p.getPrice();
        System.out.println("Total Price: $" + totalPrice);

        input.close();
    }
}
