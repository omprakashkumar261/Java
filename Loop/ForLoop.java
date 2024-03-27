package Loop;

public class ForLoop {
    public static void main(String[] args){
        // write down the loop while the print the set of any statement as your choice 
        for(int i =0; i<6; i++){
            System.out.println("*");
           // System.out.println("Hello java Welcome to  in this lecture !");
        }

        // to used the while loop in java 
        /*the while loop is the condition base that will be excute the statement till the condition are true  */
        int i=1;
        while (i<5) {
            System.out.println("*");
            i++;
        }

        // To used the do while loop in java 
        /*the do while loop is also condition base loop but in which the statement will be excute the at least one
         time then the check the condintion for printing the statement other times.
         */
        do{
            System.out.println("*");
        }while(i<5);
    }
}
