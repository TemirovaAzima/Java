void main(String[] args) {
    int[] arr = {1,2,3,2,2};
    int value = 2;
    int count = 0;
    // loop version countOccurrence
    for(int i = 0; i< arr.length; i++){
        if(arr[i] == value){
            count++;
        }
    }
    System.out.println(count);
    // enhanced loop
    for(int num : arr){
        if(num == value){
            count++;
        }
    }
    System.out.println(countOccurrence(arr,2,0));
    System.out.println(countsOccurrence(arr,value));
}
// or even loop inside the function
static int countsOccurrence(int[] arr,int value){
    int count = 0;
    for(int num : arr){
        if(num == value){
            count++;
        }
    }
    return count;
}
static int countOccurrence(int[] arr,int num , int i ){
    if(arr.length == i ){
        return 0;
    }
    return (arr[i] == num ? 1: 0) + countOccurrence(arr, num,i+1);
}

