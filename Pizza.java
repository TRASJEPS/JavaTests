import java.util.Arrays;

public class Pizza{
    
    // Access modifiers - public- private
    // THESE ARE DEFAULT BLANK ATTRIBUTES
    public String name;
    public String[] toppings;
    public int slices;  // add later!
    public double price;
    public boolean delicious;
    // IF THESE ARE SET TO private from public they can ONLY BE ACCESSED FROM WITHIN THE CLASS

    static int numberOfPizzas;  // SETUP FIRST STATIC

    //  CONSTRUCTOR - 
    //  for faster - always public and name of class
    //  THESE ARE ALL PARAMETERS
    // Pizza is the CLASS OBJECT
public Pizza(String name, String[] toppings, double price, int slices, boolean delicious)
    {
        this.name = name; // DO THIS TO REMEMBER THE JAVA QUIRK so it keeps it to the public // THIS KEEPS IT LOCAL BASED ON THIS
        this.toppings = toppings;
        this.price = price; 
        this.slices = slices;     
        this.delicious = delicious;    
        numberOfPizzas++; // USE OF STATIC CLASS
        //  THIS IS ALL FILLED, BUT IN THIS CASE IF A PARAMETER IS NOT MET it autofilles to OVERLOAD, see below
    }

    // THIS IS WHEN ITS BLANK
// METHOD OVERLOADING THIS DUPLICATES - THIS WILL HELP FILTER BASED ON WAHT THEY ENTER
// THIS WILL CREASTE A DEFAULT //  
// most common is to overload the constructor
public Pizza(String name, String[] toppings, double price, int slices, boolean delicious)
    {
        this.name = name; // DO THIS TO REMEMBER THE JAVA QUIRK so it keeps it to the public // THIS KEEPS IT LOCAL BASED ON THIS
        this.toppings = toppings;
        this.price = 40.99; 
        this.slices = 12;     
        this.delicious = delicious;    
        numberOfPizzas++; // USE OF STATIC CLASS
    }

//  GETTERS and SETTERS

//  GETTERS
public String getName()
{
    return this.name;
}

public String getToppings()
{
    return this.toppings;
}

public double getPrice()
{
    return this.price;
}

public double getSlices()
{
    return this.slices;
}

public boolean getDelicious()
{
    return this.delicious;
}

//  SETTER
//  this will still be used even though there is an overflow...
public void setName()
{
    if(name.equals(""))
        {
            System.out.println("Please enter your pizza name.");
            return;
        }
    this.name = name;
}

public void displayPizza()
    {
        // the s stands for string, b boolean the %.2f is standard money format
        System.out.printf("This is a %s with %s that costs %.2f and is it delicious? %b"        
    }

public int eatSlice(int number)
    {

    }

public static void advertise()
{
    System.out.println("Eyyyyy come get pizza ova here!  FORGETABOUTIT!!")
}

public void pizzaFight(Pizza otherPizza)
{
    int otherPizzaSlices = otherPizza.getSlices();
    otherPizzaSlices -= 1;
    otherPizza.setSlices(otherPizzaSlices);
    // WATCH LECTURE DAMNIT 7/13/21
}

// STATIC MEANS IF YOU DECLARE A DECLARE 



}