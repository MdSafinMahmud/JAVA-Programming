
import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Are you a club member? (true/false): ");
            boolean isMember = sc.nextBoolean();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (isMember && age >= 60) {
                System.out.println("You are eligible for a discount.");
            } else {
                System.out.println("You are not eligible for a discount.");
            }
        }
    }
}