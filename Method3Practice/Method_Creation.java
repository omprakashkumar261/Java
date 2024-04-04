package Method3Practice;

public class Method_Creation {
    public static void main(String [] args){
        System.out.println("Hello OP Sharma.!");
        int n1=98;
        int n2=56;
        Even_Or_Odd();
        System.out.println(n2);
        System.out.println(n1);
    }// main method end 
    //create the another method for get result the even or odd no.
    public static void Even_Or_Odd(){
        int n=12;
        if(n%2==0)
        {
            System.out.println(n+" "+"is even ");
        }
        else
        {
            System.out.println(n+" "+"is odd");
        }
    }
}
