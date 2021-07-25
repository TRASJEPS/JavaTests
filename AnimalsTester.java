import java.util.Arrays;

public class AnimalsTester{
    public static void main(String[] args) 
    {
        Animal bear = new Animal("Smokey", 6 , 100, false);
        Animal lion = new Animal("Todd", 6 , 100, false);

        bear.battle(lion, "Flame Breath");
        System.out.println(lion.getHealth());
    }

}