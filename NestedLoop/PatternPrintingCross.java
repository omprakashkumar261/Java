package NestedLoop;

public class PatternPrintingCross {
    public static void main(String [] args)
    {
        // to print the star like cross diognal line 
        int n=12; // to initialise the no.of star
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<n; j++)
            {
                if(i==j || i+j==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
