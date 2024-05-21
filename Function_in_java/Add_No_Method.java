package Function_in_java;
import java.util.Scanner;

public class Add_No_Method {
    public static void main(String[] args) {
        System.out.println("Hello ! java welcome to in this class for the method");
        add();// calling the method 
    }
    // now create the method to get the result for the add two no. as a user input 
    public static void add() {
       Scanner sc = new Scanner(System.in);
       System.out.print("take n1 = ");
       int n1= sc.nextInt();
       // now to take the second no. i.e - n2
       System.out.print("take n2 = ");
       int n2 = sc.nextInt();
       // now add both  no. 
        int res = n1+n2;
        System.out.println(res);
    }
}
