package Method2;

public class MethodCreation5 {
    public static void main(String [] args){
        System.out.println("Hello java ! ");
        int a=9;
        int b=7;
        int ans=Add(a, b);
        System.out.println(ans);
    }
    // create the method to get result of return add value and subtract value 
    public static int Add(int a, int b)
    {
        int c=a+b;
        System.out.println(Sub(c,a));
        return c;
    }//end the add method 
    // create the method to get the result of the sub
    public static int Sub(int a,int b )
    {
        return a-b;
    }
}
