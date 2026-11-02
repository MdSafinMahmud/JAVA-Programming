import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookReader {

    public static void main(String[] args) {
        try {
            
            File file = new File("books.txt");
            try (Scanner fileReader = new Scanner(file)) {
                while (fileReader.hasNextLine()) {
                    String title = fileReader.nextLine();
                    System.out.println(title);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}