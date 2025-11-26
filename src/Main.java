void main(String[] args) {

    int[] arr = {5,1,8,2,203,88,899,3};
    // loop version findMax()
    int maxNum = arr[0];
    for(int i = 0; i < arr.length ; i++ ){
        if(arr[i] > maxNum) {
            maxNum = arr[i];
        }
    }
    System.out.println(maxNum);
//    System.out.println(findMax(arr,0));
}

//static int findMax(int[] arr,int i){
//    if(arr.length-1 == i){
//        return arr[i];
//    }
//    int nextMax = findMax(arr,i+1); // we dont repeat here the findMax twice
//    return arr[i] > nextMax ? arr[i] : nextMax;
//}
//static int findMax(int[] arr,int i){
//    if(arr.length-1 == i){
//        return arr[i];
//    }
//    return arr[i] > findMax(arr,i+1) ? arr[i] : findMax(arr, i+1);
//}

