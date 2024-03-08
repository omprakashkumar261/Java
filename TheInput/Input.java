package TheInput;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        /*taking input from the user like integer or float value */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x = ");
        int x = sc.nextInt();
        System.out.println("the value of x = "+x);
        System.out.print("enter the value of y = ");
        float y = sc.nextFloat();
        System.out.println("the value of y ="+y);
    }
}
