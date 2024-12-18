import java.util.Scanner;

public class IT24104343Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        
        // Read the input
        int newMembers = scanner.nextInt();
        
        // Validate the input
        if (newMembers < 0) {
            System.out.println("The number of new members must be greater than or equal to 0.");
        } else {
            // Use a switch statement to determine the prize based on the number of new members
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            
            // Output the prize
            System.out.println("The customer is entitled to a: " + prize);
        }

        // Close the scanner
        scanner.close();
    }
}
