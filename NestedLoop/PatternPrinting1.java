package NestedLoop;

public class PatternPrinting1 {
    public static void main(String [] args){
        // Print the star as like square only outside 
        int n=6; //initialise the no.of star
        for(int i=1; i<n; i++)//this is the outer loop to control the outer line i.e rows 
        {
            for(int j=1; j<n; j++)//this is the inner loop to control the inner line i.e columns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
