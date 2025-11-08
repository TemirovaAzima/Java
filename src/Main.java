import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 2D arrays
   //        String[] fruits = {"apple","orange","banana"};
//        String[] vegetables = {"potato","onion","carrot"};
//        String[] meats = {"chicken","pork","beef","fish"};
//
//        String[][] groceries = {fruits, vegetables, meats};
          String[][] groceries = {{"apple","orange","banana"},
                                  {"potato","onion","carrot"},
                                  {"chicken","pork","beef","fish"}  };

          groceries[1][2] = "celery";
//        for(String[] foods: groceries){
//            for (String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(fruits.length);
        for(int i = 0; i < groceries.length; i++){
            for(int j = 0 ; j<groceries[i].length; j++){
                System.out.print(groceries[i][j] + " ");
            }
            System.out.println();
        }







    }
}