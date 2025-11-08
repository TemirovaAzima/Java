

public class Main {
    public static void main(String[] args)  {

//        String [] foods =  {"pizza","taco","hamburger"};
//        // this array can only 3 elements and all elements are filled with values
//
//        // create empty array and dont set up empty curly braces
//
//        String [] food = {};
//
//        food[0] = "pizza";
//        System.out.println(food.length); // it will show 0

        String[] foods = new String[3];
        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";


        System.out.println(foods.length);
        System.out.println(foods[0]);

//        for(int i = 0; i< foods.length ; i++){
//            System.out.println(foods[i]);
//        }
        for(String food : foods){
            System.out.println(food);
        }
    }
}