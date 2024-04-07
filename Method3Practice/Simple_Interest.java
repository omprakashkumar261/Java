package Method3Practice;

public class Simple_Interest {
    public static void main(String [] args){
        System.out.println("Hello Op Sharma ! welcome.....");
        simple_Interest();
    }
    // to create the method  to get result of simple interest
    public static void simple_Interest()
    {
        int principle_Amount=200;
        float rate=2.2f;
        int  time=4;
        float interest=(principle_Amount*rate*time)/100;
        System.out.println(interest);
    }
}
