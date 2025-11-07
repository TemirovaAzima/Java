import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for loop = execute some code a certain amount of times

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i<=max ; i++){
            System.out.println(i);
        }

        scanner.close();

//        for(int i = 0; i< 10 ; i++){
//            System.out.println("pizza");
//            System.out.println(i);
//        }
//        for(int i = 1 ; i<= 10 ; i++){
//            System.out.println(i);
//        }
//        for(int i= 10; i>0; i--){
//            System.out.println(i);
//        }
//        for(int i =0; i<=10; i+=2){
//            System.out.println(i);
//        }

//        for(int i = 10; i>=0; i*=2 ){
//            System.out.println(i);
//        }
    }
}