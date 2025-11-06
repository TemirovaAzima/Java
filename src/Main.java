public class Main {
    public static void main(String[] args) {
        // this is my first java program
        /*
          This
          is
          a milt-line
          comment
         */
          //        int age ;  // declaration
          int age = 21;
          //        int age = 30.5; // it is a double not int
          int year = 2025;
          int quantity = 1;

          // Primitive = simple value stored directly in memory(stack)
          // Reference = memory address (stack) that points to the (heap)

          // Primitive vs Reference
          // int           string
          // double        array
          // char          object
          // boolean
          double price = 19;
          double gpa = 3.5;
          double temperature = -12.5;

          char grade = 'A'; // single quotes
          char symbol = '!';
          char currency = '$';


          boolean isStudent = true;
          boolean isOnline = true;
          boolean forSale = true;

          if(isStudent){
            System.out.println("You are a student");
         }

          // Strings have a reference of data types
          String name = "Azima";
          String food = "sushi";
          String email = "fake123@gmail.com";
          String car = "Mustang";
          String color = "red";

          System.out.println("Hello "+ name);
          System.out.println("You are " + age + " years old");
          System.out.println("Your gpa is " + gpa);
          System.out.println("Your average letter grade is: " + grade);
          System.out.println("Your favorite is " + food);
          System.out.println("Your email is " + email);

          System.out.println("Your choice is a " + color + " " + year +" " + car);
          System.out.println("The price is " + currency + price);

          if(forSale){
              System.out.println("There is a " + car + " for sale");
          }else {
              System.out.println("The " + car + " is not for sale" );
          }

    }
}