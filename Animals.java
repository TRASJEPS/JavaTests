//
//
// TRAVIS JEPSON 2021
// 
//

import java.util.Arrays;

public class Animals{
    
    // Access modifiers
    private String name;
    private int strength;
    private int health;
    private boolean hasWings;
    // private double weight;
    // IF THESE ARE SET TO private from public they can ONLY BE ACCESSED FROM WITHIN THE CLASS

    public Animals(String name, int strength, int health, boolean hasWings)
    {
        this.name = name; // DO THIS TO REMEMBER THE JAVA QUIRK so it keeps it to the public // THIS KEEPS IT LOCAL BASED ON THIS
        this.strength = strength;
        this.health = health; 
        this.hasWings = hasWings;     
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setName(int strength)
    {
        this.strength = strength;
    }
    public void setName(int health)
    {
        this.health = health;
    }
    public void setName(boolean hasWings)
    {
        this.hasWings = hasWings;
    }

    public String getName()
    {
        return this.name;
    }
    public int getStrength()
    {
        return this.strength;
    }
    public int getHealth()
    {
        return this.health;
    }
    public boolean getHasWings()
    {
        return this.hasWings;
    }

    // REMEMBER ITS CALLED TARGET
public void battle (Animal target, String powerMove)
{
    //define the logic for how the animal attacks
    if(powerMove.equals("Slash"))
    {
        damage =3;
    }
    else if(powerMove.equals("Tail Whip"))
    {
        damage =4;
    }
    else if(powerMove.equals("Flame Breath"))
    {
        damage =5;
    }
    else
    {
        System.out.println("Move not recognized!");
    }

    int effectiveDamage = this.strength * damage;
}





}