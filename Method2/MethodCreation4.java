package Method2;

public class MethodCreation4 {
public static void main(String [] args){
    System.out.println("Hello OP Sharma !");
    int a=21;
    int b=10;
    Add(a, b);// yahan only call hogi koi output print nhi hogi 
    System.out.println(Add(a, b));// Add ke value print karne ke print  karna hoga
}// end the main method 
// to create the parametterized method/function with return type
public static int Add(int a, int b)
{
    int res=a+b;
    return res;
}
    
}
