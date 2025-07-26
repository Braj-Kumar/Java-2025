class First{
    int multi(int x, int y){
        return x*y;
    }
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String []args){
        First s1 = new First();
        System.out.println(s1.multi(5, 6));
        System.out.println(add(7,7));
        System.out.println(First.add(4, 5));  //  this line is use for the more clarity
        

    }
}