public class dobbelsteen {
    public static void main(String[] args) {
        // Simulate rolling the first die
        int die1 = rollDie();
        System.out.println("The first die comes up: " + die1);

        // Simulate rolling the second die
        int die2 = rollDie();
        System.out.println("The second die comes up: " + die2);

        // Calculate and print the total roll
        int totalRoll = die1 + die2;
        System.out.println("Your total roll is: " + totalRoll);
    }

    // Method to simulate rolling a die and returning the result
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}
