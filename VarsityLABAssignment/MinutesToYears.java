
import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter minutes: ");
            long min = sc.nextLong();

            long days = min / (24 * 60);
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(min + " minutes is approximately "
                    + years + " years and " + remainingDays + " days.");
        }
    }
}