
    import java.util.Scanner;

    public class Naam {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Ask the user for their name
            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();

            // Convert the user's name to uppercase
            String upperCaseName = userName.toUpperCase();

            // Greet the user using the uppercase name
            System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }
