package Method;

public class CreateMethod {
    public static void main(String [] args){
        // All about the method in java  in detailes....using the base of concept as your choice ...
        /*the method have a name and its define with the parametter and that have also return type i.e- called method 
          that is excutes the code or statement when it is called method */
         System.out.println("Hello java welcome to in this class for method ! "); 
         int a=89;
         int b=67;
         int c=a+b;
         add();
         System.out.println(c);
        
         
    }// Here ! end the main method in  java
    
    //to create the new method for your programm to excutes i.e to be create a your personal method 
    public static void  add(){
        int n1=10;
        int n2=20;
        int c= n1+n2;
        sub();
        System.out.println(c);  
    }// end the method 
    // create the another method to get subtraction 
    public static void sub(){
        int a=20;
        int b=15;
        int res=a-b;
        System.out.println(res);
    }


}
