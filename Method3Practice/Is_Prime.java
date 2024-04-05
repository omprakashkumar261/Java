package Method3Practice;

public class Is_Prime {
    public static void main(String [] args){
        System.out.println("Hello OP Sharma.!");
        //take any no. as your choice 
        //int a=57;
        IsPrime();
    }// end the main method 
    // to create the method to get the result of prime or not 
    public static void IsPrime()
    {
        int n=12;
        boolean IsPrime=true;
        
        // to to check the condition for nonPrime 
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                IsPrime=false;
            }
        }
        if (!IsPrime) 
        {
            System.out.println(n+" is not prime ");
        }
        else
        {
            System.out.println(n+" is a prime ");
        }
    }// end the prime method
}
