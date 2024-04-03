package Method2;

public class Method_Creation3 {
    public static void main(String [] args){
        int a=34;
        int b=12;
        System.out.println("Hello OP Sharma ! welcome");
        Addition(10, 15);

    }
    // To create the another class to get the result of addition
    public static void Addition(int a, int b)
    {
        int res=a+b;
        Subtraction(10, 15);
        System.out.println(res);
    }
    // To create the another method to get the result of subtraction
    public static void Subtraction(int x, int y)  
    {
        int result=y-x;
        System.out.println(result);
    }  
}
