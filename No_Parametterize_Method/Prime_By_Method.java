package No_Parametterize_Method;

public class Prime_By_Method {
    public static void main(String[] args) {
        prime_no(); //calling the method to get result 
        System.out.println("Hello Omprakash Kumar ji ");
    }
    // create the method to get the result for the prime no. or not
    public static void prime_no() {
        int n = 13;
        boolean isPrime = true;
        // we use the loop for n 2 to 13 
        for(int i =0; i<=n/2; i++){
            // now we will be check the condition for the num is non prime 
            if(n%2==0)
            {
                isPrime = false;
            }
        }
        // print the n is prime or not 
        if(!isPrime){
        System.out.println(n+ " is not prime  ");
        }
        else{
            System.out.println(n+ " is prime no ");
        }

    }
}
