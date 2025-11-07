
public class Main {
    public static void main(String[] args)  {

        // nested loop = A loop inside another loop
        //               Used often with matrices or DS&A
        // follow dry principle , don't repeat yourself

//        for(int i = 1; i<=9 ; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i<=9; i++){
//            System.out.print(i+ " ");
//        }
//        System.out.println();
//        for(int i = 1; i<=9; i++){
//            System.out.print(i + " ");
//        }

        for(int i = 1 ; i <=3 ; i++){
            for(int j = 1; j<=9 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}