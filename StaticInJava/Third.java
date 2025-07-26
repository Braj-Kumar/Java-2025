
class Third {
    static void circle(int r){
        System.out.println("parameter of circle is: ");
        // PI = 3.14
        System.out.println(2*Math.PI*r);
        System.out.println("Area of circle");
        System.out.println(Math.PI*r*r); 
    }
    static void square(int side){
        System.out.println("parameter of square is:");
        System.out.println(4*side);
        System.out.println("Area of Square :");
        System.out.println(side*side);
    }
    static void rectangle(int length, int breadth){
        System.out.println("parameter off rectangle: ");
        System.out.println(2*(length+breadth));
        System.out.println("Area of rectangle");
        System.out.println(length*breadth);
    }
    public static void main(String []args){
        circle(7);
        square(5);
        rectangle(4, 5);
    }   
}
