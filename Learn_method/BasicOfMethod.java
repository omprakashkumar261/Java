package Learn_method;

public class BasicOfMethod {
    public static void main(String[] args) {
        System.out.println("hello ji ok kya hai");
        int a = 10; 
        int b = 9;
        int res = a+b;
        add();// here the calling the addition method 
        System.out.println(res);
    }
    // create the method to get the result for the addition of two value
    public static void add() {
        int a = 7; 
        int b = 2;
        int c = a+b;
        System.out.println(c);
    }
}
