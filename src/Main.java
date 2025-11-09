import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        // GET CHOICE FROM THE USER
        // GET RANDOM CHOICE FROM THE COMPUTER
        // CHECK WIN CONDITIONS
        // ASK TO PLAY AGAIN

//        String rock = "rock";
//        String paper = "paper";
//        String scissors = "scissors";
        String userChoice;
        String computerChoice ;
        boolean win = false;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Rock Paper Scissors Game!");

        do{
            int randomChoice = random.nextInt(1,60);
//            System.out.println(randomChoice);
         if (randomChoice >= 1 && randomChoice <=20){
            computerChoice = "rock";
        }else if(randomChoice >20 && randomChoice <=40){
            computerChoice = "paper";
        }else {
            computerChoice = "scissors";
            }

            System.out.print("Enter your choice: ");
            userChoice = scanner.nextLine().toLowerCase();
            System.out.println("Computer choice: " + computerChoice);

            if(computerChoice.equals(userChoice)){
                System.out.println("You won! GOODBYE");
                win = true;
                break;
            }else{
                System.out.println("You lose 😥. Play again");
            }
        }
        while(!win);

//        System.out.println(computerChoice);

    }
}