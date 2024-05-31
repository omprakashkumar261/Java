package No_Parametterize_Method;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        // using the method to get the resut for the output inputs 
        System.out.println("Hey Op Sharma !");
        in();// now here!the calling the method to get the result 
    }
    // create the method to get the result  as a input 
    public static void in() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the character : ");
        char ch = sc.nextLine().charAt(0);
        // check the codition to 1 or 0 
        if(ch>'A'  && ch>'a'){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}
