package NestedLoop;

public class PatternPrintingRectangularInsideTheRectangular {
    public static void main(String[] args) {
        int n=13;// initialise the no.of star in the rectangular 
        for(int i=1; i<n; i++)// to create the outer loop for control the outer line i.e- rows 
        {
            for(int j=1; j<n; j++)//to create the inner loop go for control the inner line i.e- columns
            {
                if(i==1 || j==1 || i==(n-1) || j==(n-1) || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2)// to check the condition there needed the star
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }//end the inner loop 
            System.out.println();
        }// end the outer loop that means end the outer line 
    }
}
