package NestedLoop;

public class PatternPrintingComplex {
    public static void main(String [] args){
        // To print star diognal line 
        
        int n=12; // To initialise the no.of start to need the print 
        for(int i=1; i<n; i++)// to create the outer loop for the control the outer line 
        {
            for(int j=1; j<n; j++)// to create the inner loop for the control the inner line 
            {
                if(i==j)
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
