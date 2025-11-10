void main(){

//    for(int i = 0; i< 10 ; i++){
//        System.out.println(i);
//    }
//
//    // exercise 2
//    int wrt = 2;
//    for(int i = 0; i< 10 ; i++){
//        System.out.println(i * wrt);
//    }
//
//    // exercise 3
//
//    int num1;
//    int num2;
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter the first number: ");
//    num1 = scanner.nextInt();
//
//    System.out.print("Enter the second number: ");
//    num2 = scanner.nextInt();
//
//    if(num1 > 0 && num2 > 0){
//        System.out.println(num1 - num2);
//    }
//    else {
//        System.out.println(num1 + num2);
//    }
//
//    // exercise 4
//    char ch ;
//    System.out.print("Enter a character: ");
//    ch = scanner.next().toLowerCase().charAt(0);
//    ch = Character.toLowerCase(ch);

//    switch (ch) {
//        case 'a', 'e', 'i', 'o', 'u' -> System.out.print("it is a vowel");
//        default -> {
//        if (Character.isLetter(ch)) {
//            System.out.println("it is consonant");
//        } else {
//            System.out.println("it is not a letter");
//        }
//    }
//    }

    // exercise 5

//    boolean running = false ;
//    do {
//        System.out.print("Do you like running (true/false): ");
//        running = scanner.nextBoolean();
//    }while(running);
//
//    while(running){
//        System.out.println("You like running ");}
//
//        // next example
//        int number = 1337;
//        boolean isRunning = false;
//        do{
//            isRunning = number>0;
//            System.out.println(number/10);
//            number /=10;
//        }while(isRunning);

//    int a = 0;
//    while(a>0){
//        System.out.println("While loop executed");
//    }

//    do{
//        System.out.println("Do-while loop executed at least once");
//    }while(a>0);

//    int checkWhile =0;
//    while(true){
//        System.out.println(checkWhile++);
//        if(checkWhile ==10){
//            break;
//        }
//    }

//    do {
//        System.out.println(checkWhile++);
//        if (checkWhile ==10){
//            break;
//        }
//    }while(true);

    // exercise 6

//    int a = 5;
//    if(a<=0){
//        System.out.println("Negative");
//        a = a * -1;
//        System.out.println("Absolute value is : " + a);
//    }else{
//        System.out.println("Positive");
//        System.out.println("Absolute value is: "+ a);
//    }
//    if(a<=0){
//        System.out.println("Negative");
//        a = a * -1;
//        System.out.println("Absolute value is : " + a);
//    }
//    if (a>=0){
//        System.out.println("Positive");
//        System.out.println("Absolute value is: "+ a);
//    }

    // exercise 7
    Scanner scanner = new Scanner(System.in);
//    int id ;
//    System.out.print("Enter ur student ID: ");
//    id = scanner.nextInt();
//    int sum =0 ;
//    for(int i =0; i <= id; i++){
//        sum +=i;
//    }
//    System.out.println(sum);

    // exercise 8
//
//    int userInput ;
//    int numberCount = 0;
//    int sumOfNum = 0;
//
//
//    do {
//        System.out.print("Enter a number: ");
//        userInput = scanner.nextInt();
//        if(userInput != 0){
//            numberCount++;
//            sumOfNum += userInput;
//        }
//    }while(userInput !=0);
//    System.out.println("The total count of numbers: "+numberCount);
//    System.out.println("The sum : " + sumOfNum);

//    char ch = 'K';
//    System.out.println(ch);
//
//    for(int i = 75 ; i <150 ; i++){
//        for(char ch = 'K' ; ch < '–'; ch++){
//            System.out.print(i);
//            System.out.println(ch);
//        }
//    } // is wrong
//
//    for(int i = 75 ; i <= 150; i++){
//        char ch = (char) i;
//        System.out.println(ch + " " + i);
//    }




}