import java.util.Scanner;

public class Ques1{
    public static void main(String []args){
        System.out.println("Enter Your first number:");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        System.out.println("Enter Your 2nd Number");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();

        if(a>b){
            System.out.println("a is greater than b: "+a);
        }
        else{
            System.out.println("b is greater than a: "+b);
        }
    }
}
