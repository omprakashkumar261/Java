package BasicOfDatatype;

public class DataType {
    public static void main(String[] args) {
        /*TO manage whole no. java has provided some data_type
         * byte, short, int, long.
         */

         // to manage whole no. by byte datatype.
      System.out.println("byte ka min value "+Byte.MIN_VALUE);
      System.out.println("byte ka max value "+Byte.MAX_VALUE);  
      byte num = 78 ;
      System.out.println(num) ;
      //byte num1 = 129 ;//compile error because data is out of range 
     // System.out.println(num1);// 

     // short datatype range.
      System.out.println("short ka min value "+ Short.MIN_VALUE);
      System.out.println("short ka max value "+ Short.MAX_VALUE); 
     short num1 = 45 ;
     System.out.println(num1);

     // int datatype range find out .
     System.out.println(" integer ka min value "+Integer.MIN_VALUE);
     System.out.println("integer  ka max value "+Integer.MAX_VALUE);
     int num2 = 78665 ;
     System.out.println(num2);

     // long datatype range find out .
      System.out.println("long ka min value "+Long.MIN_VALUE);
      System.out.println("long ka max value "+Long.MAX_VALUE); 
      long num3 = 56455l ;
      System.out.println(num3);

      /*to manage all the real no. java has been provided float and double datatype */ 

      // float datatype find out the rang in java .
      System.out.println("float ka min value "+Float.MIN_VALUE);
      System.out.println("float ka max value "+Float.MAX_VALUE);
      float num4 =23.5f;
      System.out.println(num4); 

      // double datatype find out the range .
      System.out.println("double ka min value "+Double.MIN_VALUE);
      System.out.println("double ka max value "+Double.MAX_VALUE); 
      double num5 =57.76 ;
      System.out.println(num5);

      /* to manage the charactor type java has provided char datatype */
      // char datatype find out range.
      System.out.println("character  ka min value "+Character.MIN_VALUE);
      System.out.println("character ka max value "+Character.MAX_VALUE);
      char num6 = 'c';
      System.out.println(num6);

    }
}
