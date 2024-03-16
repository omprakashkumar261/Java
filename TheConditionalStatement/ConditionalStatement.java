package TheConditionalStatement;

public class ConditionalStatement {
    public static void main(String []args)
    {
        int age =61;

        //to use conditional statement with real example 
    /*  if(age>=18)
        {
            System.out.println("legel Adult !");
        }
        else
        {
            System.out.println("you're a kid !");
        }*/

        //to use all the multiple condition check in this programm..
      /* if(age>=18 && age<60)
        {
            System.out.println("you're legal adult !");
        }
        // to check another codition for the old or not 
        else if(age>=60)
        {
            System.out.println("you're a old now !");
        }
        else
        {
            System.out.println("you'are a kid !");
        }*/

        // to check the condition the person is an adult or teen and old or  kid 
        if(age>=15 && age<18)
        {
            System.out.println("you're kid !");
        }
        else if(age>=18 && age<20)
        {
            System.out.println("you're an Adult !");
        }
        else if(age>=60 && age<70)
        {
            System.out.println("you're in 60's i.e old !");
        }
        else
        {
            System.out.println("you're neither kid and neither Adult old ");
        }
    }
}
