package PatternPrinting;

public class PrintPatternFilledStar {
    public static void main(String[] args) {
        int n=13; // initialise the  
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<n; j++ )
            {
                if(i+j<=(n-1)/2 || j-i>=(n-1)/2 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
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
