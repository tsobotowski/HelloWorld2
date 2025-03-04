import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class hello {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); //Gets the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = today.format(formatter);
        Runtime runtime = Runtime.getRuntime(); //Get runtime info
        long freeMemory = runtime.freeMemory(); //Get free memory
        
        System.out.println("Here ye : important announcement");
        System.out.println("The current date is: " + formattedDate);
        System.out.println("This program has: " + (freeMemory / 1000000) + " bytes of free memory.");
        System.out.println("Hello, World!");
        System.out.println("Hello, Denise!");
        System.out.println("Hello, Ester!");
        System.out.println("And hello, Charlie!");
        System.out.println("Goodbye!");
    }
}