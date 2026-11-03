import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AttendanceRecorder {

    public static void main(String[] args) {
           try (Scanner input = new Scanner(System.in);
               FileWriter writer = new FileWriter("attendance.txt", true)) {
            
            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter status: ");
            String status = input.nextLine();
            writer.write(name + " - " + status + "\n");

            System.out.println("Record added.");
        }
        catch (IOException e) {
            System.out.println("Error: Could not write to file.");
        }
    }
}