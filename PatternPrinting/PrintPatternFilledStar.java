package PatternPrinting;

public class PrintPatternFilledStar {
    public static void main(String[] args) {
        int n=13; // initialise the  
        for(int i=1; i<n; i++)// to create the outer loop for the control the outer line i.e- rows
        {
            for(int j=1; j<n; j++ )// to create the inner loop for the control the innerline i.e- columns 
            {
                if(i+j<=(n-1)/2 || j-i>=(n-1)/2 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
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
