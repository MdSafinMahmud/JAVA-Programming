import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveStudents {

    public static void main(String[] args) {
           try (Scanner input = new Scanner(System.in);
               FileWriter writer = new FileWriter("students.txt")) {
            // I. Create the file students.txt
            // II. Ask for 3 student names, one per line in the file
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter name " + i + ": ");
                String name = input.nextLine();
                writer.write(name + "\n");
            }
            // III. Success message
            System.out.println("Data saved successfully.");
        }
        // IV. Handle IOException
        catch (IOException e) {
            System.out.println("Error: Could not write to file.");
        }
    }
}