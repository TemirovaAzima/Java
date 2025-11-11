void main() {


    // exercise 1

//    double[] arr = new double[10];
//
//
//    for (int i = 0 ; i < arr.length; i++){
//         arr[i] = Math.random() * 100 + 1;
//         System.out.println();
//         System.out.print(arr[i] + " ");
//
//    }
//
//    System.out.println();
//    // third task
//    for (int i = 0 ; i < arr.length; i++){
//        if (i % 2 ==0 ){
//            System.out.println("Even indices: " + i + " elements are " + arr[i]) ;
//        }
//    }
//    for(int i = 0; i< arr.length ; i+=2){
//        System.out.println(arr[i]);
//    }
//
//    // fourth task
////    int[] oddElem ;
//    for (int i = 0 ; i < arr.length; i++){
//        if( (int) arr[i] % 2 !=0){
//            System.out.print((int) arr[i] + " ");
//        }
//    }
//    System.out.println();

//    // exercise 2
//    char[] ch = {'a','b','c'};  // WRONG
//     int index =0;
//    for(int i = 0 ; i< ch.length; i++){
//        for(int j = 0; j < ch.length; j++){
//            if(ch[i] > ch[j]){
//                index = j;;
//            }
//        }
////        System.out.println(ch[i]);
//    }
//    System.out.println(index);


//    char[] arr1 = {'a','b','c'}; // WRONG
//    char minChar = 0;
//
//    for(int i = 0; i< arr1.length; i++){
//        for (int j = 1; j<arr1.length; j++){
//            if(arr1[i]>arr1[j]){
//                minChar = arr1[j];
//            }else {
//                minChar = arr1[i];
//            }
//        }
//    }
//    System.out.println(minChar);

//    char[] arr1 = {'a','b','c',};
//    int smallestIndex = 0;
//
//    for(int i = 0 ; i < arr1.length; i++){
//        if(arr1[i] < arr1[smallestIndex]){
//          smallestIndex = i;
//        }
//    }
//    System.out.println("Smallest value is: " + smallestIndex);

    // exercise 3
//    int day = 10;
//    int monthLeft = 2;
//    int[] monthsOfYear = {31,28 ,31,30,31,30,31,31,30,31,30,31};
//    int sumOfDays = 0;
//
//    for(int i =0; i<monthsOfYear.length - monthLeft ;i++){
//        sumOfDays += monthsOfYear[i];
//    }
//    sumOfDays +=day;
//    System.out.println(sumOfDays + " days have passed since the beginning of the year!");
//


    // teacher's code
//    int day1 = 10;
//    int month = 11;
//    int[] months = {31,28 ,31,30,31,30,31,31,30,31,30,31};
//
//    for(int i = 0 ; i < month -1 ; i++){
//        day1 += months[i];
//    }
//    System.out.println(day1 + " days have passed since the beginning of the year! ");

    // exercise 4
//    int[]  arr1 = {1,2,67,89,55,3,2};
//    int[] arr2 = {4,8,9,3,23,89,7};

//    for(int i = 0 ; i < arr1.length; i++){
//        arr1[i] = (int) (Math.random()*10 + 1);
//        arr2[i] = (int) (Math.random()*10 + 1);
//        System.out.print(arr1[i] + " ");
//        System.out.print(arr2[i] + " ");
//    }
//    System.out.println();

//    int[] newArr = new int[14];
//
//    for(int i = 0 ; i < arr1.length ; i++){
//        newArr[i] = arr1[i];
//        System.out.println(newArr[i]);
//    }

//    int[] all = new int[arr1.length + arr2.length];
//
//    for(int i = 0; i < arr1.length; i++){
//        all[i] = arr1[i];
//    }
//
//    for(int i = 0 ; i < arr2.length; i++){
//        all[arr1.length + i] = arr2[i];
//    }
//    for(int num : all){
//        System.out.print(num + " ");
//    }

//    int size =0 ;
//
////    int[] common ;
//    for(int i = 0; i < arr1.length; i++){
//        for(int j = 0; j < arr2.length; j++){
//            if(arr1[i] == arr2[j]) {
//                size++;
////                break;
//            }
//        }
//    }
//
//    int[] common = new int[size];
//
//    int index =0;
//    for(int i = 0; i < arr1.length; i++){
//        for(int j = 0; j < arr2.length; j++){
//            if(arr1[i] == arr2[j]) {
//                common[index] = arr1[i];
//                index++;
//                break;
//            }
//        }
//    }
//
//    for(int num : common){
//        System.out.println(num + " ");
//    }
//    System.out.println(size);

//    int[] arr1 = new int[]{1, 4, 2, 0};
//    int[] arr2 = new int[]{2, 6, 0, 0, 4};
//
//    int count = 0;
//
//    for (int i = 0; i < arr1.length; i++) {
//        for (int j = 0; j < arr2.length; j++) {
//            if (arr1[i] == arr2[j]) {
//                count++;
//                break;
//            }
//        }
//    }
//
//    int[] commonElem = new int[count];
//    int index = 0;
//    for (int i = 0; i < arr1.length; i++) {
//        for (int j = 0; j < arr2.length; j++) {
//            if (arr1[i] == arr2[j]) {
//                commonElem[index] = arr1[i];
//                index++;
//                break;
//            }
//        }
//    }
//    for (int num : commonElem) {
//        System.out.println(num + " ");
//    }
//
//    int count1 = 0;
//    for (int arrFirst : arr1) {
//        for (int arrSecond : arr2) {
//            if (arrFirst == arrSecond) {
//                count1++;
//                break;
//            }
//        }
//    }
//    System.out.println(count1);
//
//    int[] common1 = new int[count1];
//    int index1 = 0;
//    for (int arrFirst : arr1) {
//        for (int arrSecond : arr2) {
//            if (arrFirst == arrSecond) {
//                common1[index1] = arrFirst;
//                index1++;
//                break;
//            }
//        }
//    }
//    for (int commElem : common1) {
//        System.out.println(commElem + " ");
//    }
//    int[] arr1 = new int[]{1, 4, 2, 0};
//    int[] arr2 = new int[]{2, 6, 0, 0, 4};

//    int[] common = new int[Math.max(arr1.length, arr2.length)];
//    int index = 0;
//
//    for (int first : arr1) {
//        for (int second : arr2) {
//            if (first == second) {
//                common[index] = first;
//                index++;
//                break;
//            }
//        }
//    }
//    int[] result = new int[index];
//    for (int i = 0; i < result.length; i++) {
//        result[i] = common[i];
//    }
//
//    for (int i = 0; i < result.length; i++) {
//        System.out.print(result[i] + " ");
//    }
//    System.out.println();

//    for(int com : common){
//        System.out.println(com + " ");
//    }
    int[] arr1 = new int[]{1, 4, 2, 0};
    int[] arr2 = new int[]{2, 6, 0, 0, 4};

    int[] common = new int[Math.max(arr1.length , arr2.length)];
//    int a = 3;
//    int b = 9;
//    int result = Math.max(3,9);
//    System.out.println(Math.max(2,5));

    int index =0 ;

    for(int first : arr1){
        for(int second: arr2){
            if(first == second){
                common[index]= first;
                index++;
                break;
            }
        }
    }

    int[] result = new int[index];

    for(int i = 0 ; i < result.length; i++){
        result[i] = common[i];
    }
    for(int commEle : result){
        System.out.println(commEle);
    }

}