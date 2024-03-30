package NestedLoop;

public class PatternPrintngComplex1 {
    public static void main(String [] args)
    {
        // To print the star like- cross diognal-2
        
        int n=12; // to initialise the no.of star for print the cross diognal line -2
        for(int i=1; i<n; i++)//To create the outer loop for  control the outerline i.e- rows 
        {
            for(int j=1; j<n; j++)// To create the inner loop for the control the innerline i.e- columns
            {
                if(i+j==n-1)// To check the condition to print like- cross diognal line-2
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
