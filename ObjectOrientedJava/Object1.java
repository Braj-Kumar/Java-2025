// package ObjectOrientedJava;
class Object2{
    int x;
    int y;
    public void fun3(){
        System.out.println("fun3 called");
    }
    public void fun4(){
        System.out.println("fun4 called");
    }
}

class Object1 {
    // instace member function
    public void fun1(){
        System.out.println("fun1 called");
    }
    public void fun2(){
        System.out.println("fun2 called");
    }
    public static void main(String []args){
        // System.out.println("hello");
        Object1 o1 = new Object1();
        Object2 o2 = new Object2();
        o1.fun1();
        o1.fun2();
        System.out.println(o2.x);
        System.out.println(o2.y);
        o2.fun3();
        o2.fun4();
    }
}
