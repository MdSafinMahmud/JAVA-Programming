import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BackupStudents {

    public static void main(String[] args) {
           try (Scanner fileReader = new Scanner(new File("students.txt"));
               FileWriter writer = new FileWriter("backup.txt")) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                writer.write(line + "\n");
            }
            writer.write("End of backup\n");

            System.out.println("Backup created.");
        }

        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}