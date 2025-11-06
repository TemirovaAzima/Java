
public class Main {
    public static void main(String[] args) {
     // ternary operator

//        int score = 78;
//
//        String passOrFail =  (score>=60 ) ?  "pass" : "fail";
//        System.out.println(passOrFail);

//        int number = 72;
//        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
//        System.out.println(evenOrOdd);

//        int hours = 20;
//
//        String timeOfDay = (hours>=12) ? "P.M" : "A.M";
//        System.out.println(timeOfDay);
        int income = 30000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}