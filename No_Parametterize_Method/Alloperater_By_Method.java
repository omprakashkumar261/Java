package No_Parametterize_Method;

public class Alloperater_By_Method {
    public static void main(String[] args) {
        // print the any inforamation as your choice 
        System.out.println("Hey ! java welcome to in this class....");
        add();// calling the method to get result of adding two value
        sub();
        mul();
        div();
    }
    // to create the method to get the result for add two value
    public static void add() {
        //initialize the two value 
        int n1 = 23;
        int n2 = 54;
        int res = n1+n2;
        System.out.println(res);
    }
    // to create the method to get the result for sub two value
    public static void sub() {
        int n1 = 23;
        int n2 = 4;
        int res = n1-n2;
        System.out.println(res);
    }
    // to create the method to get the result for mul two value
    public static void mul() {
        int n1 = 23;
        int n2 = 54;
        int res = n1*n2;
        System.out.println(res);
    }
    // to create the method to get the result for div two value
    public static void div() {
        int n1 = 23;
        int n2 = 12;
        int res = n1/n2;
        System.out.println(res);
    }
}
