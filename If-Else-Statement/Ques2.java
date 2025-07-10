import java.util.Scanner;

public class Ques2{
    public static void main(String []args){
        System.out.println("Enter Your First Number");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        System.out.println("Enter Your Second Number:");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        System.out.println("Enter Your Third Number:");
        Scanner input3 = new Scanner(System.in);
        int c = input3.nextInt();

        if(a == b && a == c && b == c){
            System.out.println("All are equals");
        }
        else if(a > b && a>c){
            System.out.println("a is"+a);
        }
        else if(b>a && b>c){
            System.out.println("b is"+b);
        }
        else{
            System.out.println("c is"+c);
        }

    }
}
