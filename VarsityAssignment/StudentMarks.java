import java.util.InputMismatchException;
import java.util.Scanner;

public static void main(String[] args) {
    int[] marks = { 65, 78, 90, 55, 82, 74, 68, 95, 88, 70 };
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter Index: ");
        int index=input.nextInt();

        System.out.println("Mark at index "+ index + " is: " + marks[index]);
    } 
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error:Invalid Index.please enter a number between 0 and 9");

    }
    catch (InputMismatchException e) {
        System.out.println("Error:Invalid Input.Please enter a whole number");
    }
}