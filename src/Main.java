
void main() {
//    for(int num = 0; num <=20 ; ++num){
//        System.out.println("Factorial of "+ num +
//                           " is " + RecFun.fact(num));
//    }
//    int num = 4;
//    int result = countDown(num);
//    System.out.println(result);
//     int result =  sumOfDigits(1234);
//    System.out.println(result);
//    int num = 2;
//    int power = 5;
//    int result = power(num,power);
//    System.out.println(result);
//    int result = stringLength("cat",0);
//    System.out.println(result);
    String word = "coat";
    String reversed = "";
//    char c ;
    for(int j = word.length() - 1 ; j>=0; j--){
//       c = word.charAt(j); // also you cant change the value of word cause there are immutable
        // that's why we created the var and c
       // reversed = c won't work cause java cant automatically convert char to string
//       reversed += c ; // here reversed = reversed + c ; it can u adding string to char it is okay
        // String concatenation
        reversed += word.charAt(j); // U COULD DO LIKE THIS TOO
    }
    System.out.println(reversed);
    System.out.println("b" + 'b'); // look this is the proof (❁´◡`❁) 😎
}

//static int stringLength(String text,int i){
//    try {
//        text.charAt(i); // this is slow and bad practice
//    }
//    catch (StringIndexOutOfBoundsException e){
//        return i;
//    }
//
//    return stringLength(text,i+1);
//}

//static int stringLength(String word, int i){
//    if(i == word.length()){
//        return i;
//    }
//    return stringLength(word,i+1);
//}

//static int power(int n, int p){
//    if(p ==0){
//        return 1;  // Base case: anything^0= 1
//    }
//    return power(n,p-1)  * n;
//}

//static int sumOfDigits(int n){
//    if(n == 0){
//        return 0;
//    }
//
//    return sumOfDigits(n/10) + n%10;
//}

//static int countDown(int n ){
//    if(n == 0){
//        return 0;
//    };
//    System.out.println(n);
//     return countDown(n-1);
//     int res =  countDown(n-1);
//    System.out.println(res);
//     return res;
//    System.out.println(result);
//    return result ;



//static int countUp(int n ){
//    if(n == 0){
//        return 0;
//    };
//     int result =  countUp(n-1) + 1;
//    System.out.println(result);
//     return result ;
//
//}
//public class RecFun{
//    static int fact(int n){
//        if(n < 0) throw new IllegalArgumentException();
//        if(n<=1) return 1;
//        return n* fact(n-1);
//    }
//}
