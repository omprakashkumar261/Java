package PatternPrinting;

public class PatternPrinting2 {
    public static void main(String[] args) {
        int n=13;
        for(int i=0; i<n; i++)//create the outer loop
        {
            for(int j=0; j<n; j++)//create the inner loop 
            {
                if(i+j>=(n-1)/2 && j-i<=(n-1)/2 && i<=(n-1)/2 || i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2 && i>=(n-1)/2  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }// end the inner loop
            // create the another angle
            System.out.print("     "); 
            for(int j=0; j<n; j++)//create the inner loop 
            {
                if(i+j>=(n-1)/2 && j-i<=(n-1)/2 && i<=(n-1)/2 || i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2 && i>=(n-1)/2  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }// end the inner loop
            //create the another angle
            System.out.print("     ");
            for(int j=0; j<n; j++)//create the inner loop 
            {
                if(i+j>=(n-1)/2 && j-i<=(n-1)/2 && i<=(n-1)/2 || i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2 && i>=(n-1)/2  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }// end the inner loop
            System.out.println();
        }// end the outer loop
    }
}
