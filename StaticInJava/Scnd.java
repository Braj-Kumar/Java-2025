public class Scnd{
    static void fun1(){
        System.out.println("Static function is called");
    }
    int add(int a, int b){
        return a+b;
    }
    static int multi(int x, int y){
        return x*y;
    }
    public static void main(String []args){
        // fun1();
        // Scnd.fun1();


        // Object creation 
        Scnd s1 = new Scnd();
        System.out.println(s1.add(3,4));
        System.out.println(multi(4, 5));
        System.out.println(Scnd.multi(5, 9));   //  more precise way to call static function

    }
}
