package NestedLoop;

public class PatternPrinting {
    public static void main(String [] args){
        // to print the start like squar
        // create the outer  loop to control the outside loop
        int n=12;
        for(int i=1; i<n; i++){
            // create the inner loop for control the inside the loop 
            for(int j=1; j<n; j++){
                if(i==1 || j==1 || i==n-1|| j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");// to use not need to star as this plece
                }
            }
            System.out.print("         ");
            // create the another printing star
            for(int j=1; j<n; j++){
                if(i==1 || j==1 || i==n-1|| j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");//here dont need to printing star
                }
            } 
            System.out.println();// to create the new line 

        }
    }
}
