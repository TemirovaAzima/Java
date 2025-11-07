import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String name = "";
//        if(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }

//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello "+ name);

        // infinite loop

//         String response ="";
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//
//        }
//        System.out.println("You have quit the game");

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        while(age < 0 ) { // while loop till it will false
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old ");


        scanner.close();
    }
}