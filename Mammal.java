//
//
// TRAVIS JEPSON 2021
// 
//

import java.util.Arrays;

public class Mammal{

    // THESE ARE DEFAULT LOCKED, unlike the PIZZA
        // private int hp = 100;  // THIS CAN BE DECLARED and is the defauly
        // private String name = unknownMammal; //
        // THIS HP is the detault value
        
        private String species;
        private int health;

        public Mammal (String species, int health)
        {
            this.species = species;
            this.health = health;
        }

public String getSpecies()
{
    return species;
}
public void setSpecies(String species)
{
    this.species = species;
}

public int getHealth()
{
    return health;
}
public void setHealth(int health)
{
    this.health = health;
}

//make an interface?
public void attack(Mammal target)
{

}
        // public Mammal(int hp)
        // {
        //     this.hp = hp;
        // }

        // public Mammal(String name)
        // {
        //     this.name = name;
        // }

        // public Mammal()
        // {

        // }

        // public int getHp()
        // {
        //     System.out.println();
        //     return this.hp;
        // }

        // public int getName()
        // {
        //     System.out.println();
        //     return this.name;
        // }


}