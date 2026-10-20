import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user: ");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num 1: ");
            int a = sc.nextInt();
            System.out.print("Enter num 2: ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum is : ");
            System.out.println(sum);
        }

    }
}
