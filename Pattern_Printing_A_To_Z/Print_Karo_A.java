package Pattern_Printing_A_To_Z;

public class Print_Karo_A {
    public static void main(String [] args){
        int n=11;
        System.out.println("n="+n);
        //? to create the outer loop to control the outer line
        for(int i=0; i<n; i++) // ?this is the outer loop 
        {
            for(int j=0; j<n; j++)//? to create the inner loop to control the inner line 
            {
                if(j==0 && i>0 || i==0 && j>=1 && j<(n-1) || j==(n-1) && i>0 || i==(n-1)/2)
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
