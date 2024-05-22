package No_Parametterize_Method;
import java.util.Scanner;

public class Take_AllType_Imput {
    public static void main(String[] args) {
        System.out.println("Hey ! java welcome to in this class ....");
        input();// calling the method to get the display on the console screen in computer
    }
    // now we will-be create the method to get the all type input through the userside....
    public static void input() {
        // now create a object for the taking the input ...
        Scanner sc = new Scanner(System.in);
        //now taking the byte data as a user input 
        System.out.print("taking the byte n1 is = ");
        byte n1 = sc.nextByte();
        System.out.println("byte is "+ n1);
        //now taking the short data from the user side and show on the console screen 
        System.out.print("taking the short n2 is = "); 
        short n2 = sc.nextShort();
        System.out.println("short is " + n2);
        // now taking the integer no. i.e- whole no.
        System.out.print("taking the integer value is = ");
        int value = sc.nextInt();
        System.out.println("int is "+ value);
        // now taking the long integer value from the userside...
        System.out.print("taking the long integer value1 is = ");
        long value1 = sc.nextLong();
        System.out.println("long is "+ value1);
    }
}
