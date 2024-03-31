package NestedLoop;

public class PatternPrintingCrossSquareInsideTheSquare {
    public static void main(String[] args) {
    // we need to do print like printed the star cross square inside the square 
    int n=17;// there initialise the no.of star 
    //to create the outer loop for the control outer line i.e- rows 
    for(int i=1; i<n; i++)//to create the outer loop to control the outer line
    {
        for(int j=1; j<n; j++)// to create the inner loop to control the inner line 
        {
            if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2  || i==1 || j==1 || i==(n-1) || j==(n-1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }//end inner loop
        System.out.println();
    }//end outer loop 
        
    }
}
