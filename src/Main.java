void main(String[] args) {

    int[] arr = {5,1,8,2,203,88,899,3};
    System.out.println(findMax(arr,0));
}
static int findMax(int[] arr,int i){
    if(arr.length-1 == i){
        return arr[i];
    }
    return arr[i] > findMax(arr,i+1) ? arr[i] : findMax(arr, i+1);
}

