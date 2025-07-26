class Nokia{
    private int x;
    private int y;

    void setValue(){
        x =20;
        y=23;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class Scnd {
    public static void main(String []args){
        // System.out.println("hello");

        Nokia n1 = new Nokia();
        n1.setValue();
        n1.display();
    }
}
