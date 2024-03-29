package NestedLoop;

public class NestedLoop {
    public static void main(String [] args){
        // use to nested loop in detailes with the help of example 
        int n=5;
        for(int i=1; i<=n; i++){
            //to create the inner loop 
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.print("  ");// to create the new line
            //to create the second star printing
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();// to create the new line
        }
        
    }    
}
