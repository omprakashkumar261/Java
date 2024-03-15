package Operator;

public class LogicalOperator {
    public static void main(String []args)
    {
        int a=12;
        int b=45;
        int c=87;

        // to solve the and (&&) base questin with example 
        boolean res=(a<b && a<c && b<c);
        System.out.println(res);
        res=(a<b && a>c && b<c);
        System.out.println(res);

        // about the OR (||) operator with example 
        res=(a<b || a>c || b<c);
        System.out.println(res);
        res=(a>b && a>c && b>c);
        System.out.println(res);

        // about the NOT (!) operator with the help of example 
        res=(!true);
        System.out.println(res);
        res=(!false);
        System.out.println(res);
    }
}
