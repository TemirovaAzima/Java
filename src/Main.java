//
//public class Main {
//    public static void main(String[] args) {
////        int x = 5;
////        double y = 2.5;
////       int  result = (int)( x + y);
////        System.out.println(result);
//
////        int x = 5;
////        if(x > 0) System.out.println("x is positive");
////
////        for(int i = 0; i < 3 ; i++) System.out.println("hell");
////
////        for(int i = 0 ; i <3 ; i++)
////            System.out.println("H");
////        System.out.println("W");
//
////        int[] numbers = {1,2,3};
////        System.out.println("Original length: " + numbers.length);
////
////        // numbers.length = 5 ;
////
////        int[] biggerArray = new int[5];
////
////        for (int i = 0 ; i < numbers.length; i++){
////            biggerArray[i] = numbers[i];
////        }
////        biggerArray[3] = 4;
////        biggerArray[4] = 5;
//
//
////        System.out.println("New length: " + biggerArray.length);
////        for (int num : biggerArray){
////            System.out.print(num + " ");
////        }
//
////         int[] arr = {1,2,3};
////         System.out.println("Before: " + Arrays.toString(arr));
////
////         arr = Arrays.copyOf(arr,5);
////         arr[3] = 4 ;
////         arr[4] = 5;
////
////        System.out.println("After: " + Arrays.toString(arr));
//
////        int a = 3; // 4 bytes
////        short l = 32000; // 2 bytes
////        double b = 3;  // 8 bytes
////        float c = 3.14f; // 4 bytes
////        double d = 3.14159299999944;  // 8 bytes
////        long e = 100000000000L;  // 8 bytes
////        char f = 'a'; // 2 bytes
////        System.out.println(a + " " + b + " " + c + " " + d  + " "+ e );
//
////        char c = 10 ;
////        short s = 20;
////
////        int result = c + s ;
////        System.out.println( result);
//
////        long l = 5L;
////        float f = 2.5f;
////        long result = (long) (l + f) ;
////        System.out.println(result);
////
////        byte a = 100;
////        byte b = 50;
////        int c = ( a + b) ;
////        System.out.println(c);
//
////        int a = 1000;
////        long b = 2000L;
////        long c = a + b ;
////        System.out.println(c);
////
////        int a1 = 1000;
////        int b1 = 2000;
////        int c1 = a1 + b1;
////        System.out.println(c1);
//
//    }
//}

void main(){
//    int x = 5;
//    int y ;
//
//    y = x;     // = assigning
//    System.out.println(y);
//
//    if ( x == y ){  // == checking
//        System.out.println("The x and y are equal");
//    }
//    char stop = 'a' + 10;
//    String text = "";
//    for(char c = 'a'; c < stop; c+=2 ){
//        System.out.print(c - 'a');
//        System.out.print(' ');
//        text +=c;
//    }
//    System.out.println();
//    for(int i = text.length()-1 ; i>=0; i -=1){
//        System.out.print(text.charAt(i));
//    }
//    boolean running = false;
//    int number      = 1337;
//
//    do {
//        running = number > 0;
//        System.out.println(number / 10);
//        number /= 10;
//    } while (running);
//
//    System.out.println(017 == 17); // this 0 is octal u cant ignore the zero if u convert to decimal
    // it will become 15 and 15 = 17 no so it is false
//    System.out.println(017);
//    System.out.println(0b10101); // it is not -11 cause int is 32 bits so even though there is 1 in
    // the first significant term , java convertes to decimal and it will become int not short or byte
    // this is just how java works u know so before this 1 there is 27 zeros so i
    // the first significant does not consider as a negative number keep in mind

//    System.out.println(0xFF);

//    byte b = 0b10101;
//    short s = 0b10101;
//    int i = 0b10101;
//    System.out.println(b + s + i);
//    System.out.println(0b10101L);

    // SO 0 IS OCTAL , OX IS HEXADECIMAL , 0b IS BINARY
    // 0x MEANS BASE 16
//
//    String inHex = "2FA3";
//
//    System.out.println(0x2FA3);
////    int value = (int) (2 * Math.pow(16,3) + 15 * Math.pow(16,2) + 10* 16 + 3 * Math.pow(16,0));
//    int value = 2 * 16*16*16 + 15 * 16*16 + 10 * 16 + 3;
//
//    System.out.println(value);

//    int [] arr = new int[15];
//
//    for(int i = 0 ; i < arr.length; i++){
//        arr[i] = (int) (Math.random() * 20+1);
//        System.out.println(arr[i] + " ");
//
//        if(arr[i] % 2 ==0 && arr[i] > 10){
//            arr  = new int[i];
////            System.out.println(arr[i]);
//        }
//    }
//
//    for(int i = arr.length-1; i > 0 ; i--){
//        System.out.print(arr[i] + " ");
//    }

//    int[] arr = new int[15];

//// Fill the array with random numbers 1–20
//    for (int i = 0; i < arr.length; i++) {
//        arr[i] = (int) (Math.random() * 20 + 1);
//        System.out.print(arr[i] + " ");
//    }
//
//    System.out.println(); // move to a new line
//
//// Print even numbers > 10 in reverse order
//    for (int i = arr.length - 1; i >= 0; i--) {
//        if (arr[i] % 2 == 0 && arr[i] > 10) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    int[] arr = new int[15];

    for(int i = 0 ; i < arr.length; i++){
        arr[i] =  (int)(Math.random() * 20 + 1);
        System.out.print(arr[i] + " ");
    }

    System.out.println();
    for(int i = arr.length -1; i >0 ; i--){
        if(arr[i] % 2 ==0 && arr[i] > 10){
            System.out.print(arr[i]+ " ");
        }
    }
}