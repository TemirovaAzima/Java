import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int age =0;
//
//        do{
//            System.out.println("Your age cannot be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//
//        }while(age<0); // do while runs ur code at least once
//
//        System.out.println("You are " + age + " years old");

        int number = 0 ;
//        while(number<1 || number > 10){
//            System.out.print("Enter a number between 1-10: ");
//            number = scanner.nextInt();
//        }
        do{
           System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }while(number<1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();
    }
}