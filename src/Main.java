import java.sql.SQLOutput;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                // scanner the name of the object
        // our scanner object can read the user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // the difference between netxLine() and
        // next() is next does read till a space occur, but nexline is opposite
        // will make able to type name of users

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name );
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa );
//        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }

        // Common issues
        System.out.print("Enter your age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color");
        String color = scanner.nextLine();

        System.out.println("You are " + age2 + " years old");
        System.out.println("You like the color " + color);



        scanner.close();
        // if u dont close it can lead to the unexpected behaviour
    }
}