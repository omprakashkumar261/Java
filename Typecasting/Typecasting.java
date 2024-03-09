package Typecasting;

public class Typecasting {
    public static void main(String []args)
    {
        /*Typecasting ya implicit typecasting  */
        int a = 45;
        double b;
        b = a;
        System.out.println(b);

        /*explicite typecasting  */
        double num1=45;
        int num2;
        num2=(int)num1;
        System.out.println(num2);

        /* Trancation typecasting in java */
        int n1=21;
        int n2=12;
        float res=n1/n2;
        System.out.println(res);
    }
}
