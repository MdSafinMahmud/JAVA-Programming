import java.util.Scanner;

public class MarkValidator {
    static void validateMark(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid mark.Marks must be between 0 and 100.");

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter mark: ");
            int mark = Integer.parseInt(input.nextLine());
            validateMark(mark);
            System.out.println("Mark Accepted: "+mark);
        }
        catch (IllegalArgumentException e) {
            System.out.print("Eror" + e.getMessage());
        }
        finally {
            System.out.println("I am practicing JAVA exceptions");
            input.close();
        }

    }
}