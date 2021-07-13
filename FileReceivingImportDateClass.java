//
// TRAVIS JEPSON 2021
//
// ASSIGNMENT - Importing Data Testing
// MAKE SURE THE ImportDateTest.java is in the SAME FOLDER
// JAVA automatically links these
//

public class FileReceivingImportDateClass {
    public static void main(String[] args) {

       ImportDateTest varDate = new ImportDateTest();
       String getCurrentDate = varDate.getCurrentDate();
       System.out.println(getCurrentDate);
    }
}