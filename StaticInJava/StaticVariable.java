
public class StaticVariable {
    static int max = 100;

    int min = 10;
    public static void main(String []args){
        
        // Object creation
        StaticVariable s1 = new StaticVariable();


        // Access the non static variable
        System.out.println(s1.min-1);


        // Access the static Variable
        System.out.println(max+1);

        // more precise way to access the static varible
        System.out.println(StaticVariable.max+2);
   

    }
}
