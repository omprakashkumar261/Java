package No_Parametterize_Method;
import java.util.Scanner;

public class Prinnt_Name_Input_Method {
    public static void main(String[] args) {
        // print the any inforamation as your choice 
        System.out.println("Hey ! op sharma...");
        information();// here! calling the method...
    }
    // create the another method for the get input a name as a input from the user side
    public static void information() {
        // take input a name by scanner class 
        Scanner sc = new Scanner(System.in);
        //take the name as input 
        System.out.print("the name is :");
        String name = sc.nextLine();
        System.out.println("Apka name "+name+" hai");

    }
}
