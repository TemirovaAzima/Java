import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//     int[] numbers = {1,2,3,4,5,9,2,7};
//        String[] fruits = {"apple","orange","banana"};
//        boolean isFound = false;
//        String target;
//
//        System.out.print("Enter a fruit to search for: ");
//        target = scanner.nextLine();
//       int target =  2;
//
//        for(int i = 0; i< fruits.length; i++){
//            if (fruits[i].equals(target)){
//                System.out.println("Element found at index " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if(!isFound){
//            System.out.println("Element not found in the array");
//        }
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"orange","apple", "pineapple","coconut"};
        String target ;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for(int i = 0; i< fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("element found at index: " + i);
                isFound = true;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }

    }
}