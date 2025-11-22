
void main() {
   int result = factorialRecursive(6);
    System.out.println(result);
}

int factorialRecursive(int n){
    if(n==1){
        return 1;
    }
    int tmp = factorialRecursive(n-1);
    return tmp * n;
}