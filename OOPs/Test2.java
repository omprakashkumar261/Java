package OOPs;
// printed of the object value
public class Test2 {
    int num;
    String name;
    public static void main(String[] args) {
        Test2 obj = new Test2();
        System.out.println(obj.num);
        System.out.println(obj.name);
        // result will be printed defult i.e - 0 , null because of instace variable as part of object that is created within the class
        // and that wiil be stored in the Heap memory area
    }
}
