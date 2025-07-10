
import java.util.Scanner;

public class Ques1{
    public static void main(String args[]){
        System.out.println("Enter Your first number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter Your next Number ");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        System.out.println("Before Swapping Numbers: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After Swapping...");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
