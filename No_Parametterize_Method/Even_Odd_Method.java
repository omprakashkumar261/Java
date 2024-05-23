package No_Parametterize_Method;

public class Even_Odd_Method {
    public static void main(String[] args) {
       System.out.println("Hello ji OP sharma "); 
       even_Odd();// calling the method to get the result of instruction
    }
    // create the another method to get the result for the 
    public static void even_Odd() {
        int n = 5;
        // to check the n is even or odd 
        if(n%2==0) {
            System.out.println("the n :"+ n + " even hai");
        }
        else {
            System.out.println("the n : "+ n + " odd hai");
        }
    }
}
