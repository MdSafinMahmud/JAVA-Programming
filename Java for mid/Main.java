class Student {
    // Fields (state)
    private final String name;
    private final int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods (behavior)
    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim", 20);
        Student s2 = new Student("Karim", 22);

        s1.display();  // Rahim is 20 years old.
        s2.display();  // Karim is 22 years old.
    }
}