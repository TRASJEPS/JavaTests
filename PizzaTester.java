import java.util.Arrays;

public class PizzaTester{
    public static void main(String[] args) 
    {

        // class is a blueprint on how to make objects
        // NAME : pizza
        // attributes : size, toppings, slices
        // methods : display, eat, advertise
        // Pizza cheesePizza = new Pizza();
        // String[] toppings = {"Sauce", 'Cheese'};
        
        // cheesePizza.name "Cheese Pizza";
        // cheesePizza.delicious = false;
        // cheesePizza.slices =4;
        // cheesePizza.price = 9.99;
        // cheesePizza.toppings = toppings;

        // System.out.println(Arrays.toString(cheesePizza.toppings));

        String[] toppings = {"Sauce", 'Cheese'};
        // dont confuse the VARIABLE NAME WITH THE NAME PARAMETER/ATTRIBUTE
        Pizza cheesePizza = new Pizza("Cheese Pizza", new String[] {"Sauce","Cheese"}, 9.99, 8, true);
        
        System.out.println("Total Pizzas Made: " Pizza.numberOfPizzas)
        Pizza.advertise();
        cheesePizza.pizzaFight(hawaiian);
    }

}