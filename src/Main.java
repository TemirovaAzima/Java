import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enhanced switches
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

//        switch(day){
//            case "monday" -> System.out.println("It is a weekday");
//            case "tuesday" -> System.out.println("It is a weekday");
//            case "wednesday" -> System.out.println("It is a weekday");
//            case "thursday" -> System.out.println("It is a weekday");
//            case "friday" -> System.out.println("It is a weekday");
//            case "saturday" -> System.out.println("It is a weekend");
//            case "sunday" -> System.out.println("It is a weekend");
//            default -> System.out.println(day + " is not a day");
//        }
        // we will consolidate this

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
                    System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }
    }
}