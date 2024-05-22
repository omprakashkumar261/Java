package No_Parametterize_Method;
import java.util.Scanner;

public class TakeInputChar {
    public static void main(String[] args) {
        System.out.println("Hey ! java are u good !");
        character();// now calling the charater methot for displaying on the console screen 
    }
    // now we will-be create the method to taking the character and display on the console
    public static void character() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" take the single character is = ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("The charater is = "+ ch);
    }
}
