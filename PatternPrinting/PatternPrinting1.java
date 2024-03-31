package PatternPrinting;

public class PatternPrinting1 {
    public static void main(String [] args){
        int n=20;// initialise the no.of star for printing in the  rectangular 
        for(int i=0; i<n; i++)// to create the outer loop for getting the print the star for control the outer line 
        {
            for(int j=0; j<n; j++)// to create the inner loop for getting the control the inner lines to print star 
            {
                if(i==0 && j<=(n-1)/2 ||j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 || i==0 && j>=(n-1)/2 || j==(n-1) && i<=(n-1)/2 || j-i>=(n-1)/2 || j==0 && i>=(n-1)/2 ||i==(n-1)&& j<=(n-1)/2 || i-j>=(n-1)/2 || i==(n-1) && j>=(n-1)/2 || j==(n-1)&& i>=(n-1)/2 || i+j>=(n-1)+(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }//end the inner loop
            //to create the new line 
            System.out.println();
        }// end the outer line 

    }
}
