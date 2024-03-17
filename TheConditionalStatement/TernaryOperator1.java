package TheConditionalStatement;

public class TernaryOperator1 {
    public static void main(String[] args){
        int a=34;
        int b=45;
        // rule follows as ternary operator in the next line....
        int res=(a>b)?a:b;
        System.out.println(res);

        // take another ex... of ternary operator to solve problemm
        int n1=65;
        int n2=67;
        int n3=68;
        // to used nesting ternary operator
        int res1=(n1>n2)?(n1>n3?n1:n2):(n2>n3?n2:n3);
        System.out.println(res1);

        //the ternary operator works like if else block statements
        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println(n1);
            }
            else
            {
                System.out.println(n2);
            }
        }
        else
        {
            if(n2>n3)
            {
                System.out.println(n2);
            }
            else
            {
                System.out.println(n3);
            }
        }

    }
}
