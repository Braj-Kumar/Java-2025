public class StaticBlock {
    static int x = 5;
    static int b;
    static int c;
    // static block
    static{
        System.out.println("First Static Blocked called");
        b = x*4;
    }

    static{
        System.out.println("Second Static Blocked called");
        c = b*5;
    }
    static void display(){
        System.out.println(x);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String []args){

        System.out.println("Main function called");
        display();
    }    
}
