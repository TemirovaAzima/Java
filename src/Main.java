import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
      // array = a collection of values of the same data type

        String[] fruits = {"apple","banana","coconut","orange"};
        fruits[0] ="orange";
        System.out.println(fruits[3]); // u will get a reference of array not itself cause arrays are references not primitives

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        // enhanced loop
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
        Arrays.sort(fruits);
        Arrays.fill(fruits,"kok");
        for(int i = 0 ; i< fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
    }
}