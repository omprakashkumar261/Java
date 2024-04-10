package TheInput;
import java.util.Scanner;

public class Integer_And_Double_Take_input {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num1;
        double num2;
        System.out.print("Enter the value of num1= ");
        num1=sc.nextInt();
        System.out.println(num1);// ? to print the value of num1......
        //to take the value as a double datatype..
        System.out.print("Enter the value of num2=");
        num2=sc.nextDouble();
        System.out.println(num2);
    }
}
