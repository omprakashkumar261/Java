package Pattern_Printing_A_To_Z;

public class Print_Karo_D {
    public static void main(String [] args){
        int n=17; //? initialise the no.of n i.e -how much requare star to print on the console 
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1) || i==(n-1) && j<(n-1)/2 || j==0)
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
