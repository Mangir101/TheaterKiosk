import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");

        // Read the user's age
        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine();

            // Give a wrist band if age is 21 or older
            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Run the program again and enter a valid age!");
        }
    }
}