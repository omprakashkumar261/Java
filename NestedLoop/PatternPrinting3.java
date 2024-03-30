package NestedLoop;

public class PatternPrinting3 {
    public static void main(String[] args) {
        // print the star as a like multiple square as same line 
        int n=14;// to initialise the no.of star for the multiple square 
        for(int i=1; i<n; i++)//to create the outer loop for the control outline i.e rows 
        {
            for(int j=1; j<n; j++)// to create the inner loop for the control the innerline i.e columns
            {
                if (i==1 || j==1 || i==(n-1) ||j==(n-1)) 
                {
                  System.out.print("*");  
                }
                else 
                {
                    System.out.print(" ");
                }
            }
           // System.out.println();
            System.out.print("     ");

            // to print the second star priting for multiple time
            for(int j=1; j<n; j++)// to create the inner loop for the control the innerline i.e columns
            {
                if (i==1 || j==1 || i==(n-1) ||j==(n-1)) // check the condition where the need to star 
                {
                  System.out.print("*"); // print the star  
                }
                else 
                {
                    System.out.print(" ");// we need to space where dont need to star i.e here need space
                }
            }
            //System.out.println();
            System.out.print("     ");

            // to print third star printing go for the multiple time
            for(int j=1; j<n; j++)// to create the inner loop for the control the innerline i.e columns
            {
                if (i==1 || j==1 || i==(n-1) ||j==(n-1)) 
                {
                  System.out.print("*"); // where print the star  
                }
                else 
                {
                    System.out.print(" ");// where need to space for the there dont need the star
                }
            }
            System.out.println();
        }
        
    }
}
