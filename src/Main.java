import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      // Number guessing game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts =0 ;
        int max = 100;
        int min = 1;
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between " + min + "-" + max+ ": ");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++ ;
            if(guess < randomNumber){
                System.out.println("TOO LOW, try again");
            }
            else if(guess >randomNumber){
                System.out.println("TOO HIGH, try again");
            }
            else {
                System.out.println("Correct! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts );
            }
        }while(guess != randomNumber);

        scanner.close();
    }
}