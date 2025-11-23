
void main() {
//    for(int num = 0; num <=20 ; ++num){
//        System.out.println("Factorial of "+ num +
//                           " is " + RecFun.fact(num));
//    }
    int num = 4;
    int result = countUp(num);
//    System.out.println(result);


}

static int countUp(int n ){
    if(n == 0){
        return 0;
    };
     int result =  countUp(n-1) + 1;
    System.out.println(result);
     return result ;

}
//public class RecFun{
//    static int fact(int n){
//        if(n < 0) throw new IllegalArgumentException();
//        if(n<=1) return 1;
//        return n* fact(n-1);
//    }
//}
