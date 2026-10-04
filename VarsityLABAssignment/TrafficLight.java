
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter traffic light color (Green/Yellow/Red): ");
            String color = sc.nextLine();

            if (color.equalsIgnoreCase("Green")) {
                System.out.println("Keep driving.");
            } else if (color.equalsIgnoreCase("Yellow")) {
                System.out.println("Prepare to stop.");
            } else if (color.equalsIgnoreCase("Red")) {
                System.out.println("Stop.");
            } else {
                System.out.println("Invalid traffic light color.");
            }
        }
    }
}