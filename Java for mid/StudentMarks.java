
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 1st subject:");
        double s1 = sc.nextDouble();
        System.out.println("Enter marks of 2nd subject:");
        double s2 = sc.nextDouble();
        System.out.println("Enter marks of 3rd subject:");
        double s3 = sc.nextDouble();
        System.out.println("Enter marks of 4th subject:");
        double s4 = sc.nextDouble();
        System.out.println("Enter marks of 5th subject:");
        double s5 = sc.nextDouble();
        double total = (s1 + s2 + s3 + s4 + s5);
        double percentage = ((total / 500) * 100);
        System.out.println("Total marks: " + total);
        System.out.println("Total percantage: " + percentage+"%");
        sc.close();
    }
}
