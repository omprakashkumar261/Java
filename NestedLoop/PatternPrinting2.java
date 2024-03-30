package NestedLoop;

public class PatternPrinting2 {
    public static void main(String[] args) {
        int n=12; // to initialise the no.of star for square
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<n; j++)
            {
                if(i==1 || j==1 || i==n-1 || j==n-1)
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
