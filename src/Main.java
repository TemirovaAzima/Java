void main(String[] args) {
    int[] arr = {1,2,3,2,2};
    System.out.println(countOccurrence(arr,2,0));
}
static int countOccurrence(int[] arr,int num , int i ){
    if(arr.length == i ){
        return 0;
    }
    return (arr[i] == num ? 1: 0) + countOccurrence(arr, num,i+1);
}

