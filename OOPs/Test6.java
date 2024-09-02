package OOPs;
//  method overloading...
    class Calc {
        public int  add(int n1, int n2)
        {
            int res = n1+n2;
            return res;
        }
        //to create the anoter method 
        public int  add(int n1, int n2, int n3)
        {
            int res = n1+n2+n3;
            return res;
        }
        public double add(double n1, double n2)
        {
            double res = n1+n2;
            return res;
        }
    }
public class Test6 {
    public static void main(String[] args) {
        Calc obj = new Calc();
       int res= obj.add(4,6);
       int res1= obj.add(5,8,78);
      double res2= obj.add(5.5, 52.5);
       System.out.println(res);
       System.out.println(res1);
       System.out.println(res2);
    }
}
