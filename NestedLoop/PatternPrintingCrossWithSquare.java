package NestedLoop;

public class PatternPrintingCrossWithSquare {
    public static void main(String[] args) {
        // TO Print star like cross with square 
        int n=22;// to initialise the no.of star 
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<n; j++)
            {
                if(i==j || i+j==(n-1) || i==1 || j==1 || i==(n-1) || j==(n-1)) // to check the condition there the need star 
                {
                    System.out.print("*");// to print star 
                }
                else
                {
                    System.out.print(" ");// dont need star i.e here need only space
                }
            }
            System.out.println();
        }
    }
    
}
