
public class Main {
    public static void main(String[] args) {

        String name = "Password";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("a");

//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("a","o");


//        System.out.println(name.isEmpty());
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cannot be password");
        }
        else{
            System.out.println("Hello " + name);
        }


    }
}