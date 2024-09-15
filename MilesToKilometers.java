package Pro5;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of miles
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        
        // Conversion factor: 1 mile = 1.60934 kilometers
        double kilometers = miles * 1.60934;
        
        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        
        // Close the scanner
        scanner.close();
    }
}
