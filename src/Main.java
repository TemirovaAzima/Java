void main(String[] args) {


}
static boolean isPalindrome(char[] c, int i){
    if (i >= c.length - 1 - i) return true;
    if (c[i] != c[c.length - 1 - i]) return false;
    return isPalindrome(c, i + 1);
}

// reverse a char[] recursively
static void reverseRecursive(char[] arr, int left, int right){
    if (left >= right) return;

    char temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    reverseRecursive(arr, left + 1, right - 1);
}

// build the inside-out result recursively
static char[] doInsideOut(boolean isPal, char[] c, int i){
    if (!isPal) {
        System.out.println("Not a palindrome");
        return c;
    }

    // only do the transformation once: when i == 0
    if (i != 0) return c;

    int n = c.length;
    int half = n / 2;

    // split into two halves recursively
    char[] left = Arrays.copyOfRange(c, 0, half);
    char[] right = Arrays.copyOfRange(c, half, n);

    // reverse each half recursively
    reverseRecursive(left, 0, left.length - 1);
    reverseRecursive(right, 0, right.length - 1);

    // build result
    char[] res = new char[n];

    // copy reversed right (first half)
    copyRecursive(right, 0, res, 0);

    // copy reversed left (second half)
    copyRecursive(left, 0, res, half);

    return res;
}

// recursive array copy
static void copyRecursive(char[] src, int si, char[] dest, int di){
    if (si == src.length) return;
    dest[di] = src[si];
    copyRecursive(src, si + 1, dest, di + 1);
}

//
////    System.out.println(reverseString("cat",0));
////    System.out.println(findPower(2,6));
////    int num = 123;
////    int copy = num ;
////    int size = 0;
////    int[] result = splitDigits(num,copy,0);
////    System.out.println(Arrays.toString(result));
////    int number = 123;
////    System.out.println(number.);
////    while(copy > 0){
////        copy = copy/10;
////        size++;
////    }
////    int[] arr = new int[size];
////    for(int i = size - 1 ; i >=0; i--){
////        if(num > 0){
////            arr[i] = num % 10;
////            num = num /10;
////        }
////    }
////    System.out.println(Arrays.toString(arr));
//    char[] c = {'a','b','c','c','b','a'};
////    char[] c = {'a','b','c','d','e','f','f','e','d','c','b','a'};
//
//    boolean result = isPalindrome(c,0);
////    System.out.println(result);
//    char [] res = doInsideOut(result, c,0);
//    System.out.println(Arrays.toString(res));
//
//}
//
//static boolean isPalindrome(char[] c, int i){
//    if((c.length -1)/2 == i){
//        return true;
//    }
//
//    if(c[i] != c[c.length-1-i]){
//        return false;
//    }
//    return isPalindrome(c,i+1);
//}
//
//static char[] doInsideOut(boolean isPal, char[] c , int i){
//    if(i == ((c.length-1)/2)){
//        return c ;
//    }
//    if(isPal){
//        if(c.length%2 == 0){
//            char temp = c[i];
//            c[i] = c[(c.length/2) -1 -i];
//            c[(c.length/2)-1 -i] = temp;
//            c[(c.length/2)+ i] = temp;
////            c[c.length -1] = c[i] ;
//            c[c.length -1-i] = c[i];
////            c[c.length -1] = temp2;
//
//        }
//    }
//    else{
//        System.out.println("It is not palindrome");
//        return c;
//    }
//    return doInsideOut(isPal,c, i+1);
//}
