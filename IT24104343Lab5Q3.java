import java.util.Scanner;

public class IT24104343Lab5Q3 {
    // Constants for room charge and discount rates
    public static final double ROOM_CHARGE_PER_DAY = 48000.0;
    public static final int DISCOUNT_3_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for start and end dates
        int startDate, endDate;
        
        // Input start date and end date
        System.out.print("Enter the start date (1-31): ");
        startDate = scanner.nextInt();
        
        System.out.print("Enter the end date (1-31): ");
        endDate = scanner.nextInt();
        
        // Validation 1: Check if dates are between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Date must be between 1 and 31.");
            return;  // Exit the program if the validation fails
        }
        
        // Validation 2: Check if start date is less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;  // Exit the program if the validation fails
        }
        
        // Calculate number of days reserved
        int numberOfDays = endDate - startDate + 1;
        
        // Calculate total amount without discount
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        
        // Calculate discount based on number of days reserved
        double discount = 0;
        
        if (numberOfDays >= 5) {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        } else if (numberOfDays >= 3) {
            discount = DISCOUNT_3_4_DAYS;
        }
        
        // Apply the discount to the total amount
        double discountedAmount = totalAmount * (1 - discount / 100.0);
        
        // Display the result
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount to be paid: Rs " + discountedAmount);
        
        // Close the scanner
        scanner.close();
    }
}
