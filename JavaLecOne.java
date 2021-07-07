
// TRAVIS JEPSON 2021 JAVA

// new Car f150 = 1996 Ford F-150;
// f150.Honk, f150.Drive, f150.Break;
// everything is an object that decends from the class

// THIS MUST BE THE NAME OF THE FILE
// THIS IS THE MAIN METHOD - or entry point method
// ALWAYS INCLUDE THESE INITIAL 2 LINES

// CHECK FOR THE JAVA EXTENSION PACK
public class JavaLecOne{
    public static void main(String[] args) {

        System.out.println("EYYY its the world ova here!");

        // THESE ARE DATA TYPE - PRIMITIVES
        // VARIABLE identifiers, cannot start with a digit
        byte myByte = 100; //stores numbers from -128 to 127
        short myShort = 1000; //stores whole numbers from -32768 to 32767
        int myInt = 1000000; //stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLongt = 1000000000000L; // Must end with L stores a LOT of numbers ZILLIONS!
        // MUST END WITH f YES BUT YOU CAN FORMAT FOR CURRENCY?
        float myFloat = 3.14f; //stores numbers up to 6 to 7 decimil digits
        double myDouble = 3.123745475; //Stores fractions up to 15 digits
        boolean myBool = true; //stires TRue or FALSE
        char myChar = 'c'; //stores single char/letter or ASCII value
        int woh = 1337;

        // THESE ARE - WRAPPER CLASSES or REFERECNE TYPES
        Integer myInteger = 10000; //Object of the variable we declared
        Character myCharacter = 'q';
        System.out.println(Character.toUpperCase(myCharacter));  //THis akes the q to Q

        // STRING
        String myString = "Java is the coolest. Be 1337.";
        String myString2 = "Java 2021 forever!";
        System.out.println(myString2);
        myString.equals(myString2);

        // VARIABLE IS case sensitive
        String bootcamp = "Never";
        String bootCamp = "Gona Give";
        String bootCAMP = "You Up";
        System.out.println(bootcamp + bootCamp + bootCAMP);

        // OPERATORS AND CONDITIONALS
        int theNumberChecked = 5;
        if (theNumberChecked % 2 != 0)
        {
            System.out.println("The number is odd!");
        }
        else
        {
            System.out.println("The number is not odd!");
        }
        
        int a =0;
        while ( a < 15)
        {
            System.out.println(a);
            a++;
        }

        for (int i =0; i <5; i++)
        {
            System.out.println(i);
        }

        // ***    METHODS branches off from the main method?   ***
        // THEY EXIST OUTSIDE OF MAIN METHOD {}
        // SEE BELOW
        sayHello();
        System.out.println(sayHelloWithName("BILLY!!"));
    }
        //METHODS - DONT NEED a semi after the {}
        public static void sayHello()
        {
            System.out.println("Hello!");
        }
        public static String sayHelloWithName( String name)
        {
            return "Hi " + name;
        }

}