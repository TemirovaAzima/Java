import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // Weight Conversion Program

        // Declare variables

        Scanner scanner = new Scanner(System.in);

        double weight ;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kgs ");
        System.out.println("2: Convert kgs to lbs ");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is: " + newWeight);
        }
        else if (choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462 ;
            System.out.println("The new weight in lbs is: " + newWeight);
        }
        else {
            System.out.println("That was not a valid choice ");
        }

        scanner.close();
        // welcome message

        // prompt for user choice

        // option 1 convert lbs to kgs

        // option 2 convert kgs to bs

        // else print not a valid choice
    }
}