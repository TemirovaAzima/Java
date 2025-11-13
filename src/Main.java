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
//    int[] arr1 = new int[]{1, 4, 2, 0};
//    int[] arr2 = new int[]{2, 6, 0, 0, 4};

//    int[] common = new int[Math.max(arr1.length , arr2.length)];
//    int a = 3;
//    int b = 9;
//    int result = Math.max(3,9);
//    System.out.println(Math.max(2,5));
//
//    int index =0 ;
//
//    for(int first : arr1){
//        for(int second: arr2){
//            if(first == second){
//                common[index]= first;
//                index++;
//                break;
//            }
//        }
//    }
//
//    int[] result = new int[index];
//
//    for(int i = 0 ; i < result.length; i++){
//        result[i] = common[i];
//    }
//    for(int commEle : result){
//        System.out.println(commEle);
//    }
//    int[] arr1 = new int[]{1, 4, 2, 0};
//    int[] arr2 = new int[]{2, 6, 0, 0, 4};
//
//
//    int[] combinedArr = new int[arr1.length + arr2.length];
//
//    for(int i = 0; i < arr1.length; i++){
//        combinedArr[i] = arr1[i];
//    }
//
//    for(int j = 0; j < arr2.length;j++){
//        combinedArr[arr1.length+j] = arr2[j];
//    }
//
//    for(int comman : combinedArr){
//        System.out.println(comman);
//    }
//
//    int smallest = 0;
//    int index = 0;
//
//    for(int i =0; i < combinedArr.length;i++){
//        if(combinedArr[i] < combinedArr[index]){
//            smallest = combinedArr[i];
//            index = i;
//        }
//    }
//    System.out.println("smallest element: " + smallest);
//
//    int largest = 0;
//    int index1 = 0;
//    for(int i = 0; i < combinedArr.length;i++){
//        if(combinedArr[i] > combinedArr[index1]){
//            largest = combinedArr[i];
//            index1 = i;
//        }
//    }
//    System.out.println("largest element: " + largest);
//
//
//    // looping
//
//    int[] rangeLoop = new int[largest - smallest + 1];
//
//    for(int i = smallest; i <rangeLoop.length ; i++){
//        rangeLoop[i] = i;
//        System.out.println(rangeLoop[i]);
//    }
//
//    System.out.println("lollll");
//    int[] result = new int[rangeLoop.length+combinedArr.length];
//    int index2 = 0;
//    for(int rangeL : rangeLoop){
//        for(int combined: combinedArr){
//            if(rangeL == combined){
////                result[index2] = rangeL;
////                index2++;
////                break;
//                System.out.println("Notthing");
//            }else{
//                result[index2]=rangeL;
//                index2++;
//            }
//        }
//    }
//    for(int res: result){
//        System.out.println(res);
//    }
////    int[] realResult = new int[]
////    for (int i = 0; i < result.length;i++){
////
////    }


//    int[] arr1 = {1, 4, 2, 0};
//    int[] arr2 = {2, 6, 0, 0, 4};
//
//    // 1️⃣ Combine both arrays
//    int[] combinedArr = new int[arr1.length + arr2.length];
//    for (int i = 0; i < arr1.length; i++) {
//        combinedArr[i] = arr1[i];
//    }
//    for (int j = 0; j < arr2.length; j++) {
//        combinedArr[arr1.length + j] = arr2[j];
//    }
//
//    // 2️⃣ Find smallest and largest
//    int smallest = combinedArr[0];
//    int largest = combinedArr[0];
//
//    for (int i = 1; i < combinedArr.length; i++) {
//        if (combinedArr[i] < smallest) smallest = combinedArr[i];
//        if (combinedArr[i] > largest) largest = combinedArr[i];
//    }
//
//    System.out.println("Smallest element: " + smallest);
//    System.out.println("Largest element: " + largest);
//
//    // 3️⃣ Create range of numbers between smallest and largest
//    int[] range = new int[largest - smallest + 1];
//    int num = smallest;
//    for (int i = 0; i < range.length; i++) {
//        range[i] = num;
//        num++;
//        System.out.println(range[i]);
//    }

//    int[] arr1 = new int[] {1,4,2,0};
//    int[] arr2 = new int[] {2,6,0,0,4};
//
//    // Combine both arrays
//    int[] combinedArr = new int[arr1.length+arr2.length];
//
//    for(int i = 0; i < arr1.length; i++){
//        combinedArr[i] = arr1[i];
//    }
//
//    for(int i = 0; i < arr2.length; i++){
//        combinedArr[arr1.length + i] = arr2[i];
//    }
//
//    for(int array: combinedArr){
//        System.out.println(array);
//
//    }
//
//    // find the smallest and largest
//
//    int smallest = combinedArr[0];
//    int largest = combinedArr[0];
//
//    for(int i = 0; i < combinedArr.length; i++){
//        if(combinedArr[i] < smallest) smallest = combinedArr[i];
//        if(combinedArr[i] > largest) largest = combinedArr[i];
//    }
//
//    System.out.println("Smallest element: " + smallest);
//    System.out.println("Largest element: " + largest);
//
//    // create range of numbers between smallest and largest
//
//
//    int[] range = new int[largest - smallest + 1];
//    int num = smallest;
//    for(int i = 0; i < range.length; i++ ){
//        range[i] = num;
//        num++;
//    }
//
//    // create an array for numbers NOT in combinedArr
//
//    int size= 0;
//    for(int i = 0 ; i < range.length; i++){
//        boolean isFound = false;
//
//        for(int j = 0; j < combinedArr.length; j++){
//
//            if(range[i] == combinedArr[i]){
//                isFound = true;
//                break;
//            }
//        }
//        if(!isFound){
//            size++;
//        }
//    }
//
//    System.out.println("Size" + size);
//    int[] result = new int[size];
//    int index =0;
//    for(int i = 0; i < range.length ; i++){
//        boolean isFound = false;
//
//        for(int j = 0 ; j < combinedArr.length; j++){
//            if(range[i] == combinedArr[j]){
//                isFound = true;
//                break;
//            }
//        }
//        if(!isFound){
//            result[index] = range[i];
//            index++;
//        }
//    }

    // Print final numbers that do NOT appear in either array
//
//    System.out.println("Numbers between smallest and largest NOT in either array: ");
//    for (int finalResult : result){
//        System.out.print(finalResult + " ");
//    }

//    int[] a = {3,3}, b = a;
//    a[0] =1 ;
//    b[1] = 2;
//
//    System.out.println(a[0] + " " + a[1] + " " + b[0] + " " + b[1]);
//
//    int x = 12;
//    int y = x;
//    x = 13;
//    System.out.println(x + " " + y);
//
//    String name = "Azima";
//    String friendName = name;
//
//    name = "AzimaKim";
//    System.out.println(name + " " + friendName);

//    int[][] a = {{1,2,3},{4,5},{6,7},{8,9}};
//    System.out.println( a.length+ a[1].length+ a[0][2]);
//    System.out.println("Hello"=="11");
//    System.out.println(0187);
//    long num = 880L;
//    int day = 2;
//     String dayName = switch(day){
//         case 1 -> "Monday";
//         case 2 -> {
//             System.out.println("Logging Tuesday");
//             int temp = day * 2;
//             yield "Tuesday";
//         }
//         default -> "Unknown";
//     };
//
//    System.out.println(dayName);
//    int a = 3, b = 6;
//    int c = a++ + ++b;
    // a++ is use the current value of a first, then increase a by 1 afterwards
//    System.out.println(a + " " + b + " " + c);

//    int sum = 0;
//     for(int i = 4; i < 12; ++i){
//         if(i % 5 == 1) continue;
//         sum+=i;
//     }
//    System.out.println(sum);
//
//    for(int i = 1; i<=5; i++){
//        System.out.print(i>2 ^ i <=4 ? "T" : "F");
//    }
//    System.out.println();
//    int k = 4;
//    int[] arr = new int[4];
//    int i = 0;
//    while(k < 12){
//        if(k / 6 ==1) arr[i]++;
//        i++;
//        if(i == 4) i =0;
//        k++;
//    }
//    System.out.println(Arrays.toString(arr));
//
//    // 5
//    int v = 15;
//    if(v % 4 == 1 && v > 12 || v < 7 ) System.out.println("Ok?");
//    System.out.println((int) Math.random());

//    int[] tab = {1,2,3,4,4,3,2,1};
//    boolean result = true ;
//
//    for(int i =0, j = tab.length-1 ; i < tab.length/ 2 ; i++, j--){
//        if(tab[i] != tab[j]){
//            result = false;
//            break;
//        }
//    }
//    System.out.println(result);

//       int[] tab = {1,2,3,4,4,3,2,1};
//      boolean isSymmetrical = true;
//
//      for (int i =0; i < tab.length/2; i++){
//          if(tab[i] != tab[tab.length-1 - i]){
//              isSymmetrical = false;
//              break;
//          }
//      }
//    System.out.println(isSymmetrical);

    // exercise 2

//    boolean[] arr = {true, false, true , true, false , false, true};
//    boolean[] arr = new boolean[10];
//
//    for(int i = 0; i < arr.length; i++){
//        arr[i] = Math.random() < 0.5 ? true : false;  // or Math.random() < 0.5
//    }
//    System.out.println(Arrays.toString(arr));
//
//    int sizeT = 0;
//    int sizeF = 0;
//
////    for(int i = 0; i < arr.length; i++){
////        if(arr[i]){
////            sizeT++;
////        }
////        else{
////            sizeF++;
////        }
////    }
//    for(boolean elem: arr){
//        if (elem){
//            sizeT++;
//        }
//        else{
//            sizeF++;
//        }
//    }
//
//    boolean[] valueT = new boolean[sizeT];
//    boolean[] valueF = new boolean[sizeF];
//
//    for(int i = 0; i < valueT.length; i++){
//        valueT[i] = true;
//    }
//
////    for (int i = 0; i < valueF.length;i++){
////        valueF[i] = false;
////    }
//    System.out.println(Arrays.toString(valueT));
//    System.out.println(Arrays.toString(valueF));
//
//    // teacher code
//    boolean[] booleans = new boolean[10];
//
//    for(int i = 0 ; i < booleans.length; i++){
//        booleans[i] = Math.random() < 0.5;
//    }
//
//    for(boolean b : booleans){
//        System.out.println(b + " ");
//    }
//
//    int countOfTrues = 0;
//
//    for(boolean b : booleans){
//        if(b){
//            countOfTrues++;
//        }
//    }
//
//    boolean[] trues  = new boolean[countOfTrues];
//    boolean[] falses = new boolean[booleans.length - countOfTrues];
//
//    for(int i = 0; i < trues.length; i++){
//        trues[i] = true;
//    }
//
//    System.out.println(Arrays.toString(booleans));
//    System.out.println(Arrays.toString(trues));
//    System.out.println(Arrays.toString(falses));

//    Scanner in = new Scanner(System.in);
//
//    char[] arr = new char[5];
//
//    for(int i = 0; i < arr.length; i++){
//        arr[i] = (char) (Math.random() * 26 + 65);
//        System.out.println(arr[i]);
//    }
//    char c ;
//    int numOccurrence = 0 ;
//    boolean isTerminated = false;
//      boolean  allZero = false;
//
//    do {
//
//        System.out.println("Enter a letter between A - Z : ");
//        c = in.next().toUpperCase().charAt(0);

//        for(int i = 0; )
//         if(true){
//
//             switch(c){
//                 case 'A','B'
//             }
//         }
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] == c){
//                numOccurrence++;
//                arr[i] =0;
//            }
//
//            allZero = true;
//            if(char ch : arr){
//               if(ch!=0){
//                   allZero = false;
//                   break;
//               }
//            }
//        }
//
//    }while(!allZero);
//
//    Scanner in = new Scanner(System.in);
//
//    char[] arr = new char[5];
//
//    for(int i = 0; i < arr.length; i++){
//        arr[i] = (char)(Math.random() * 26 + 65);
//        System.out.print(arr[i] + " ");
//    }
//
//    boolean allZero = false;
//    int occurrence = 0;
//    do {
//        System.out.println("Enter a letter between A-Z: ");
//        char c = in.next().toUpperCase().charAt(0);
//
//
//        for(int i = 0; i < arr.length;i++){
//            if(arr[i] == c){
//                arr[i] = 0;
//                occurrence++;
//            }
//        }
//
//        System.out.println("The occurrence of  " + c + " : " + occurrence);
//        for(char ch : arr){
//            ch = ch == 0 ? '0': ch;
//            System.out.print(ch + " ");
//        }
//        System.out.println();
//
//        allZero = true;
//        for(char ch : arr){
//            if(ch !=0){
//                allZero = false;
//                break;
//            }
//        }
//    }while(!allZero);
//
//    System.out.println(Arrays.toString(arr));
//    in.close();

//    char[] letters = new char[5];
//
//    for(int i = 0; i < letters.length; i++){
//        letters[i] = (char) (Math.random() * 26 + 65);
//    }
//    Scanner scanner = new Scanner(System.in);
//    boolean areThereLetters = true;
//
//    while(areThereLetters){
//
//        System.out.println(Arrays.toString(letters));
//        char c = scanner.next().toUpperCase().charAt(0);
//
//        int count = 0;
//
//        for(int i = 0; i < letters.length;i++){
//            if(letters[i] == c){
//                letters[i] = 0;
//                count++;
//            }
//        }
//        if(count > 0){
//            System.out.println(c + " - " + count);
//        }
//
//        areThereLetters = false;
//        for(char ch: letters){
//            if(ch!= 0){
//                areThereLetters= true;
//                break;
//            }
//        }
//    }
//
//    scanner.close();

//  String inHex = "2FA3";
//  int value = 0;
//  int h = 0;
//  for(int i = 0 ; i < inHex.length(); i++){
//      switch(inHex.charAt(i)){
//          case '0','1','2','3','4','5','6','7','8','9' -> h = inHex.charAt(i) - '0';
//          case 'A','B','C','D','E','F' -> h = inHex.charAt(i) - 'A' + 10;
//      }
//      value += (int) (h * Math.pow(16, inHex.length() -1 -i ));
//  }
//    System.out.println(0x2FA3);
//    System.out.println(value);

    // finding the longest consecutive length of a number

//    Scanner in = new Scanner(System.in);
//
//   int currentNumber ;
//   int previousNumber;
//   int currentCount = 1;
//   int maxCount = 1;
//   int numberWithMax =0 ;
//
//   previousNumber = in.nextInt();
//
//   if(previousNumber == 0){
//       System.out.println("No numbers entered");
//   }
//
//   while(true){
//       currentNumber = in.nextInt();
//       if(currentNumber ==0){
//           break;
//       }
//
//       if(currentNumber == previousNumber){
//           currentCount++;
//       }
//       else{
//           if(currentCount > maxCount ){
//               maxCount = currentCount;
//               numberWithMax = previousNumber;
//           }
//           currentCount = 1;
//       }
//       previousNumber = currentNumber;
//   }
//
//   if (currentCount > maxCount){
//       maxCount = currentCount;
//       numberWithMax = previousNumber;
//   }

//    System.out.println("The length of the longest consecutive sequence is : " + maxCount + " times " + numberWithMax);
//
//    int[] arr = {153,333,370,515,407,80};
//     int value =0 ;
//    for(int i = 0; i < arr.length;i++){
//        value += (int) Math.pow(arr[i],arr[i.length].);
//    }
//    int a = 356;
//    System.out.println(a.length(););

//    int[] arr = {153,333,370,515,407,80};
//     int value =0 ;
//
//     for(int i = 0; i < arr.length; i++){
//         for(int j = 0 ; j < arr.length ; j++){
//             value += (int) (Math.pow(arr[i].chartAt(j),arr[i].length));
//
//             if(value == arr[i]){
//                 System.out.println(value + "is armstrong");
//             }
//         }
//     }

//    int[] arr = {153,333,370,515,407,80};
//
//    for(int i = 0; i < arr.length; i++){
//        int num = arr[i];
//        int temp = num;
//        int digits = String.valueOf(num).length();
//        int sum = 0;
//
//        while(temp > 0){
//            int digit = temp % 10;
//            sum+= Math.pow(digit,digits);
//            temp /=10;
//        }
//        if(sum == num){
//            System.out.println(num + " is an Armstrong number");
//        }
//    }

//    int[] arr = {153,333,370,515,407,80};
//
//    for(int i = 0; i < arr.length; i++){
//
//        int num = arr[i];
//        int temp = num;
//        int sum = 0;
//        int digitLength = String.valueOf(num).length();
//
//        while(temp>0){
//            int eachDigit = temp % 10 ;
//            sum += (int) (Math.pow(eachDigit,digitLength));
//            temp /= 10;
//        }
//        if(sum == num) {
//            System.out.println(num + " is an armstrong number");
//        }
//    }


    int[] arr1 = {3,4,1,5,6,2};

    for(int i = 0; i < arr1.length - 1 ; i++){
        for(int j = 0; j < arr1.length - 1 -i; j++){
            if(arr1[j] > arr1[j+1]){
                int temp = arr1[j];
                arr1[j] = arr1[j+1];
                arr1[j+1] = temp;
            }
        }
    }

    for(int num: arr1){
        System.out.print(num + " ");
    }
}

