public class First{
    public static void fun1(){
        System.out.println("A");
    }
    public static void fun2(){
        System.out.println("B");
    }
    public static void fun3(){
        System.out.println("D");
    }
    public static void main(String []args){
        fun1();
        System.out.println("C");
        fun2();
        fun3();
    }
}