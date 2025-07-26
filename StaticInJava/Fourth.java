class Base1{
    static void fun1(){
        System.out.println("A");
    }
    static void fun2(){
        System.out.println("B");
    }
}
public class Fourth {
    public static void main(String[] args) {
        System.out.println("C");
        Base1.fun1();
    }
}
