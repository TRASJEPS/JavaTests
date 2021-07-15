
// TRAVIS JEPSON 2021 JAVA

//  This covers basic syntax and other key variables

// new Car f150 = 1996 Ford F-150;
// f150.Honk, f150.Drive, f150.Break;
// everything is an object that decends from the class

// THIS MUST BE THE NAME OF THE FILE
// THIS IS THE MAIN METHOD - or entry point method
// ALWAYS INCLUDE THESE INITIAL 2 LINES

// CHECK FOR THE JAVA EXTENSION PACK
//
// classes should be UPPER CASE starting letters
// this MUST MATCH the file name EXACTLY Pascal case 
public class JavaLecOne{
    //
    // this is a METHOD name and all METHOD names should start off lower case.
    public static void main(String[] args) {
        // THIS MAIN METHOD IS CALLED ** void becuase it does not return anything  **
        // if you were to add a ** return string ** before the last curly brace at end
        // then you would call public static string

        // public: This is known as an access modifier. Any public method we write is accessible from any other class or method in our project.
        // static:  means that the method belongs to and is called from the class itself rather than from an instance of the class.
        // void: indicates that the main() method doesn't return anything.

        System.out.println("EYYY its the world ova here!");

        int emptyInt;   //DOES NOT NEED VALUE.

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
        char myChar = 'c'; //stores single char/letter or ASCII value basically a single character of any type like a string but limited to 1 character
        int woh = 1337;
        int woh2 = 1331;

        // when casting or assigning to VARIABLES you can cast a smaller value into a larger one or convert a larger value into a smaller one
        // EXPLICITLY CASTING ^

        // you can Implicitly cast an into to a float! int i = 34; float f = i;  f = 34.0



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

        // This is a cool way to format it
        String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja);
        // Will print out Hi Jack, you owe me $25.00 !
        // Where %s is expecting a string
        // And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.

        // THis shows the index position of the string
        String ninja = "Welcome to Coding Dojo!";
        int a = ninja.indexOf("Coding"); // a is 11
        int b = ninja.indexOf("co"); // b is 3
        int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found

        // COMPARE EQUALITY!!  remember the CHARACTERS vs the OBJECT itself
        String a = new String("word");
        String b = new String("word");
        System.out.println(a == b); // false. not the same exact object.
        System.out.println(a.equals(b)); // true. same exact characters.

        // Integer: The Integer class wraps a value of the primitive type int into an object.
        // Long: The Long class wraps a value of the primitive type long in an object.
        // Boolean: The Boolean class wraps a value of the primitive type boolean in an object.
        // Double: The Double class wraps a value of the primitive type double in an object.
        // Character: The Character class wraps a value of the primitive type char in an object.
        // String: Represents a sequence of characters, like a Python string.
        // BigInteger: Represents an integer that can be any size at all.
        
        //
        // * * * * * 
        //THIS IS SUPER IMPORTANT - - - -
        // * * * * *
        //
        // Notice that primitive types are lowercase, while object types are capitalized.
        
        // Integer is an object type instance of the class 
        // public static void main(String[] args) {
        //     long start = System.currentTimeMillis();
        //     Integer sum = 0;
        //     for (int i = 0; i < Integer.MAX_VALUE; i++) {
        //         sum += i;
        //     }
        //     System.out.println("Sum: " + sum);
        //     long end = System.currentTimeMillis();
        //     double total = (double) (end - start) / 1000;
        //     System.out.println("Time of execution: " + total + " seconds");
        // // }
        // RETURNS THIS
        // Sum: 1073741825
        // Time of execution: 6.477 seconds

        // public static void main(String[] args) {
        //     long start = System.currentTimeMillis();
        //     int sum = 0;
        //     for (int i = 0; i < Integer.MAX_VALUE; i++) {
        //         sum += i;
        //     }
        //     System.out.println("Sum: " + sum);
        //     long end = System.currentTimeMillis();
        //     double total = (double) (end - start) / 1000;
        //     System.out.println("Time of execution: " + total + " seconds");
        // }
            // RETURN THIS 
        // Sum: 1073741825
        // Time of execution: 0.763 seconds    

        // null values: Primitive data types can only hold data.   CANNOT BE EMPTY
        // However, Object types are pointers to where the data is stored. 
        // This means that this pointer can point to nothing (null), while primitive types cannot.

        // public class TestNull {
        //     public static void main(String[] args) {
        //         Integer a = 10;
        //         int b = 10;
        //         a = null;
        //         b = null;
        //     }
        // }



        

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

        // other examples 
        boolean defenderGuarding = true;
        boolean closeToBasket = true;
        if(defenderGuarding == true) {
            System.out.println("Pass The Ball");
        } else if(closeToBasket == true) {
            System.out.println("Shoot The Ball");
        } else {
            System.out.println("Dribble The Ball");
}


        // ***    METHODS branches off from the main method?   ***
        // THEY EXIST OUTSIDE OF MAIN METHOD {}
        // SEE BELOW
        sayHello();
        System.out.println(sayHelloWithName("BILLY!!"));
    }
        //METHODS - DONT NEED a semi after the {}
        // shouldnt this be public static string?!!?
        public static void sayHello()
        {
            System.out.println("Hello!");a
        }
        public static String sayHelloWithName( String name)
        {
            return "Hi " + name;
        }

}