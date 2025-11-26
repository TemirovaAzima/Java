
void main() {
    String pal = "ABCDDCB";
    System.out.println(isPalindrome(pal,0,pal.length()-1));
}
static boolean isPalindrome(String word,int i,int j){
    if(i>=j){
        return word.charAt(i) == word.charAt(j);
    }
    return word.charAt(i) == word.charAt(j) ? isPalindrome(word,i+1,j-1): false;
}
//static boolean palindrome(String word,int i,int j){
//    if((word.length()-1) / 2== i){
//        return word.charAt(i) == word.charAt(j);
//    };
//    return word.charAt(i) == word.charAt(j) ? palindrome(word,i+1,j-1): false;
//}

