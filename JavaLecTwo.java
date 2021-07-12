// TRAVIS JEPSON 2021 JAVA

import java.util.Arrays;   //MAKES ABILITY TO LIST ARRAYS
import java.util.ArrayList;   //MAKE ABILITY TO USE ARRAY LIST
import java.util.HashMap;   //MAKE ABILITY TO USE HASH MAPS

public class JavaLecTwo{
    public static void main(String[] args) {

        System.out.println("");
        System.out.println(" * * * ");
        System.out.println("");
        System.out.println("");
        System.out.println("Lecture 2");
        System.out.println("");
        System.out.println("");
        System.out.println(" * * * ");
        System.out.println("");

String name = "Bobby B";
String name2 = "Sarah C";
System.out.println("");
System.out.println("");
//THESE ARE STORED IN BASE STRING  // AREA 1 //

String name3 = new String ("Sarah C in AREA 2"); //THIS IS A NEW MEMORY LOCATION // AREA 2 //
String name4 = new String ("Sarah C in AREA 3"); //THIS IS A NEW MEMORY LOCATION // AREA 3 //
String name5 = new String ("Sarah C in AREA 4"); //THIS IS A NEW MEMORY LOCATION // AREA 4 //

System.out.println(name + " " + name2);

//ARRAYS!  YES!!
String[] people = {"Matt","Travis","Kira","Sal","Hank","Paullie"};  // ONCE THIS IS SET IT MUST BE 6 SLOTS!!!  YOU CANNOT LENGTHEN IT.  CANNOT ADD TO IT.
people[0] = "NFG";  // THIS REPLACES Matt with NFG   // CAN ONLY REPLACE IT

int[] numbers = new int[10];
for(int i = 0; i < numbers.length; i++)
{
    numbers[i] = i + i;
}
System.out.println("");
System.out.println("");
System.out.println(numbers);
System.out.println(Arrays.toString(numbers));
System.out.println("");
System.out.println("");

// for EACH LOOP
//Another way to print out arrays
// GOES THROUGH numbers array
// BECAUSE PRIM NOT CAPITAL int
for(int iterator : numbers)
{
    System.out.println(iterator);
}

// GOES THROUGH PEOPLE
// BECAUSE OBJECT  CAPITAL String
for(String iterator2 : people)
{
    System.out.println(people);
}

// make an EVIL ARRAY.  Can add garbage to it.
Object[] myEvilArray = { 42, "pie", true , "d",123123123232.23};

// ARRAY LIST!  DIAMOND CONSTRUCTORS!
// SINGLE ATTRIBYTE
ArrayList<String> myStringList = new ArrayList<String>();
myStringList.add("POGG");
myStringList.add("DIAMOND HANDS");
myStringList.add("MEMES");
myStringList.add("DOGGE");
System.out.println(myStringList);

System.out.println(myStringList.get(2)); // GRABS ARRAY SLOT 3   // OR LIKE THIS System.out.println(myStringList[2]);
System.out.println(myStringList.indexOf(2));  // GETS SLOT 

for(int i = 0; i < myStringList.size(); i++)
{
    System.out.println(myStringList.get(i));
}

// OBJECT = has key value pairs...

// HASH MAPS  -  CRITICAL IN SPRING BOOT - SUPER FAST
// STORE VALUES WITH A KEY then ACCESS WITH A VALUE
// THIS TELLS THE VALUE WILL BE A STRING  // SO COOL
// CONSTRUCTOR TO PASS IN PARAMETERS , THE FIRST TWO STRINGS , THEN YOU MAKE A NEW OBJECT FROM THE SUPERCLASS
// ONLY TWO OF EACH!!! ONLY TWO.  KEY AND LOCK
HashMap<String, String> ourHobbies = new HashMap<String, String>();
ourHobbies.put("Matthew","Photography");
ourHobbies.put("Travis","Painting");
ourHobbies.put("Sarah","Gold Panning");
ourHobbies.put("Eddie","Cow Tipping");
ourHobbies.put("Willie","PWNING noobs");
ourHobbies.put("Nathan","Drawing");
ourHobbies.put("Tray","Rage Quitting");
ourHobbies.put("Sean","SC2");
ourHobbies.put("Ross","Golf");
ourHobbies.put("Kevin","Being Awesome");
System.out.println("");
System.out.println("");
System.out.println("Travis' hobby:");
System.out.println(ourHobbies.get("Travis"));
System.out.println("");
System.out.println("");
System.out.println(ourHobbies);   // COMES FROM COLLECTION SUPERCLASS!  so you get data!  not memory slot  //NOT IN ORDER

for(HashMap.Entry<String, String> entry : ourHobbies.entrySet())
{
    System.out.println("Key = " + entry.getKey() + "Value = " + entry.getValue());  //list EM ALL
}

// TEST  String and int BuT IT MUST BE Integer
HashMap<String, Integer> trippleHashExp = new HashMap<String, Integer>();
trippleHashExp.put("Matthew",31);
trippleHashExp.put("Travis",999);
trippleHashExp.put("Sarah", 22);
trippleHashExp.put("Eddie", 11);
trippleHashExp.put("Willie", 32);
trippleHashExp.put("Nathan", 67);
trippleHashExp.put("Tray", 53);
trippleHashExp.put("Sean", 34);
trippleHashExp.put("Ross", 22);
trippleHashExp.put("Kevin", 39);
System.out.println("");
System.out.println("");
System.out.println("Tray's age:");
System.out.println(trippleHashExp.get("Tray"));
System.out.println("");
System.out.println("");
System.out.println(trippleHashExp);   // COMES FROM COLLECTION SUPERCLASS!  so you get data!  not memory slot  //NOT IN ORDER

System.out.println("");
System.out.println("");
System.out.println("EXPERIMENT - Entered Keys: Names and Value: Ages");
System.out.println("");
for(HashMap.Entry<String, Integer> entry : trippleHashExp.entrySet())
{
    
    System.out.println("Key NAME = " + entry.getKey() + "   Value AGE = " + entry.getValue());  //list EM ALL
    
}
    System.out.println("");
    System.out.println(" * * END OF HASH MAP 2 VAL TEST * * ");
    System.out.println("");

// TEST  String and TUPLE try combining with other elements
// HashMap<String, Tuple<Integer, String>> tupleHashMap = new HashMap<String, Tuple<Integer, String>>();
// //
// tupleHashMap.put("Matthew",31);
// tupleHashMap.put("Travis",999);
// tupleHashMap.put("Sarah", 22);
// tupleHashMap.put("Eddie", 11);
// tupleHashMap.put("Willie", 32);
// tupleHashMap.put("Nathan", 67);
// tupleHashMap.put("Tray", 53);
// tupleHashMap.put("Sean", 34);
// tupleHashMap.put("Ross", 22);
// tupleHashMap.put("Kevin", 39);
// System.out.println("");
// System.out.println("");
// System.out.println("Tray's age:");
// System.out.println(tupleHashMap.get("Tray"));
// System.out.println("");
// System.out.println("");
// System.out.println(tupleHashMap);   // COMES FROM COLLECTION SUPERCLASS!  so you get data!  not memory slot  //NOT IN ORDER

// System.out.println("");
// System.out.println("");
// System.out.println("EXPERIMENT - Entered Keys: Names and Value: Ages");
// System.out.println("");
// for(HashMap.Entry<String, Integer> entry : trippleHashExp.entrySet())
// {
    
//     System.out.println("Key NAME = " + entry.getKey() + "   Value AGE = " + entry.getValue());  //list EM ALL
    
// }
//     System.out.println("");
//     System.out.println(" * * END OF HASH MAP 3 VAL TEST * * ");
//     System.out.println("");


    }

        // DONT DO THIS :P
        // ADD A TRY CATCH TO FIX IT
        // public static int maxArrayValue(int[] nums)  // ORG SETUP
        // find max in array...
        public static void maxArrayValue(int[] nums)
        {
            int biggestCoolNumber = nums[0];
            for(int i = 0; i < nums.length; i++)
            {
                try
                {
                    if(biggestCoolNumber < nums[i])
                    {
                        biggestCoolNumber = nums[i];
                    }
                }
                catch
                (IndexOutOfBoundsException e)
                {
                    
                        System.out.println(e);
    
                }  // OR JUST TYPE EXCEPTION
            }
            // return biggestCoolNumber;
            System.out.println("");
            System.out.println("");
            System.out.println(biggestCoolNumber);
            System.out.println("");
            System.out.println("");
        }
}