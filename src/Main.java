import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // declare variables
      // first welcome message
        //  prompt for user choice
        // 1 option converting to  fahrenheit
        // 2 option converting to celsius
        // else print  not a valid choice

        double temp ;
        double newTemp;
        String unit ;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

//        System.out.println(choice);
//        System.out.println(temp);
//        newTemp = (temp * 9/5) + 32;
//        System.out.println(newTemp);
//        System.out.println(choice);
//        System.out.println(choice.equals("f"));
//        System.out.println( (temp - 32) * 5/9);

        newTemp = (unit.equals("F")) ? ((temp * 9/5) + 32) : (temp - 32) * 5/9;
        System.out.println("The temperature is " + newTemp + "°" + unit);
       scanner.close();
    }
}