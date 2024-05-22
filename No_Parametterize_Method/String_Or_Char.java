package No_Parametterize_Method;
import java.util.Scanner;

public class String_Or_Char {
    public static void main(String[] args) {
        System.out.println("Hello ! java how are u ");
        character();// here ! the calling the method and also display it on the console
        string();// calling the method to get the name display on the console screen 
    }
    // create the another method to get the input string and slso character from the user side 
    public static void string() {
        // create the object for the taking the string as a input 
        Scanner sc = new Scanner(System.in);
        System.out.print("the name is = ");
        String name = sc.nextLine();
        System.out.println("the name "+ name + " hai");
    }
    //now create the another method to get character as a input from the user side 
    public static void character() {
        // create the object to get the input as a character 
        Scanner sc = new Scanner(System.in);
        // now we will-be take the input as a character from the user side ....
        System.out.print("the character is = ");
        char ch = sc.nextLine().charAt(0);
        // now display the character on the console screen 
        System.out.println("the character " + ch + " hai");
    }
}
