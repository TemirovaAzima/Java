import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        // GET CHOICE FROM THE USER
        // GET RANDOM CHOICE FOR THE COMPUTER
        // CHECK WIN CONDITIONS
        // ASK RO PLAY AGAIN
        // GOODBYE MESSAGE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes ";

        System.out.println("ROCK PAPER SCISSORS GAME");
        do{
            System.out.print("Enter your move (rock,paper,scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid choice!");
                continue;
            }

//          computerChoice = random.nextInt(3);
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice is: " + computerChoice);

            if(computerChoice.equals(playerChoice)){
                System.out.println("It is a tie!");
            }
            else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes") && !playAgain.equals("no")){
                System.out.println("Invalid choice");
            }

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing GOODBYE!");

        scanner.close();
    }
}