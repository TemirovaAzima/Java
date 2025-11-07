import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)  {

        // JAVA DICE ROLLER PROGRAM

        // DECLARE VARIABLES -X
        // GET # OF DICE FROM THE USER - X
        // CHECK IF # OF DICE > 0 -X
        // ROLL ALL THE DICE -X
        // GET THE TOTAL -X
        // DISPLAY ASCII OF DICE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numbOfDice ;
        int totalOfDice = 0;
        int roll ;

        System.out.print("Enter the # of dice to roll: ");
        numbOfDice = scanner.nextInt();

        if(numbOfDice > 0 ){
            for(int i = 0 ; i < numbOfDice ; i++){
                roll = random.nextInt(1,7);
                System.out.println("You rolled "+roll);
                displayDie(roll);
                totalOfDice += roll;
            }
            System.out.println("The total is "+ totalOfDice);
        }
        else {
            System.out.println("# of dice must be greater than 0");
        }
        scanner.close();
    }

    static void displayDie (int roll){

        String dice1 = """
                 -------
               |         |
               |    ●    |
               |         |
                 -------
               """;

        String dice2 = """
                 -------
               | ●       |
               |         |
               |       ● |
                 -------
               """;
        String dice3 = """
                 -------
               | ●       |
               |    ●    |
               |       ● |
                 -------
               """;
        String dice4 = """
                 -------
               | ●     ● |
               |         |
               | ●     ● |
                 -------
               """;
        String dice5 = """
                 -------
               | ●     ● |
               |    ●    |
               | ●     ● |
                 -------
               """;
        String dice6 = """
                 -------
               | ●     ● |
               | ●     ● |
               | ●     ● |
                 -------
               """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}