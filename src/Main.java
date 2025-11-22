
void main() {
//   int result = factorialRecursive(6);
//    System.out.println(result);

    int resultFibRec = fibRec(9);
    System.out.println(resultFibRec);
}
static int fibRec(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return fibRec(n-1) + fibRec(n-2);
}
//int factorialRecursive(int n){
//    if(n==1){
//        return 1;
//    }
//    int tmp = factorialRecursive(n-1);
//    return tmp * n;
//}

//static int fibRec(int n){
//    int f =0;
//    int s = 1;
//    int result = 0;
//
//    if(n == 0){
//        return 0;
//    }
//
//    int res = f+ s + fibRec(n-1);
//    result = f + s;
//    f = s;
//    s = result;
//
//    return res;
//}

//static int fibRec(int n){
//    int f = 0;
//    int s = 1;
//    int result = 0;
//    if(n==1){
//        return 1;
//    }
//    result = f + s;
//    f = s ;
//    s = result;
//
//    result = fibRec(n-1) + fibRec(n-2);
//    return result ;

//
//    result = f + s;
//    f = s;                                      // MY SHIT CODE LOL
//    s  = result ;
//    System.out.println(f + "First Number");
//    System.out.println(s + "Second Number");

//    System.out.println("hehe");
//    int tmp =  fibRec(n-1);
//    System.out.println(tmp + "lol");
//    tmp = f + s ;
//    f = s;
//    s = tmp;
//    return tmp ;
//}
