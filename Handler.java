//
//
// TRAVIS JEPSON 2021
// 
//  THIS HOLDS is the MAIN to Bat.java and Mammal.java
//  only need to compile this
//

// can call it Zookeeper
import java.util.Arrays;

public class Handler
{
    public static void main(String[] args)
        {
            Bat zooBat = new Bat();

            Mammal matthew = new Mammal();
            
            System.out.println("Ima Zoobat! " + "Total HP: " + zooBat.getHp());
            System.out.println(matthew.getHp());
        }
}