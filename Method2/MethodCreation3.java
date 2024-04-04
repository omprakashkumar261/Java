package Method2;

public class MethodCreation3 {
    public static void main(String [] args){
        System.out.println("Hello OP Sharma ! welcome to in this class");
        int a=12;
        int b=11;
        int i=1;
        int j=2;
        Addition(12, 15);
        Addition(a, b);
        Addition(i,j);
        Addition(i, a);
        Addition(i, b);
    }// end the main method to end the excution of the code 
    // to create the another method for the addition with parametterized method
    public static void Addition(int x, int y)
    {
        int res=x+y;
        System.out.println(res);
    }
}
// the output is Hello OP Sharma ! welcome to in this class
/*27
23
3
13
12*/
