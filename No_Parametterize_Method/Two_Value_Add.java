package No_Parametterize_Method;
import java.util.Scanner;

public class Two_Value_Add {
    public static void main(String[] args) {
        adding();//now here ! calling the adding method to get results
        System.out.println("Hey ! java most welcome in this class ");
    }
    // create the another method to get the result for add two value as a user input
    public static void adding() {
        Scanner sc = new Scanner(System.in);
        System.out.print("take value of n1 = ");
        int n1 = sc.nextInt();
        // now will-be take another value i.e- n2 
        System.out.print("now take the n2 value = ");
        int n2 = sc.nextInt();
        int res = n1+n2;
        System.out.println(res);
    }
}
