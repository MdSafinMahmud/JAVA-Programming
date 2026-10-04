
import java.util.Scanner;

public class EmployeePayment {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double rate = 8.25;
            double totalPayment;

            System.out.print("Enter hours worked: ");
            double hours = sc.nextDouble();

            if (hours > 40) {
                double regularPayment = 40 * rate;
                double overtimePayment = (hours - 40) * rate * 1.5;
                totalPayment = regularPayment + overtimePayment;
            } else {
                totalPayment = hours * rate;
            }

            System.out.printf("Total payment: $%.2f%n", totalPayment);
        }
    }
}