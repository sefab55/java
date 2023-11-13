import java.util.Scanner;

public class geldteller {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of quarters
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        // Ask the user for the number of dimes
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        // Ask the user for the number of nickels
        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        // Ask the user for the number of pennies
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        // Calculate the total value in dollars
        double totalDollars = calculateTotalDollars(quarters, dimes, nickels, pennies);

        // Display the total value
        System.out.println("You have $" + totalDollars);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to calculate the total value in dollars
    public static double calculateTotalDollars(int quarters, int dimes, int nickels, int pennies) {
        // Calculate the total value in dollars
        double totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        double totalDollars = totalCents / 100.0;

        return totalDollars;
    }
}

