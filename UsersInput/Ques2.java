import java.util.Scanner;

public class Ques2{
    public static void main(String []args){
        // System.out.println("hello");

        Scanner input1 = new Scanner(System.in);
        System.out.println("enter Your first number");
        int num1 = input1.nextInt();

        System.out.println("Enter Your Second Number");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        int sum = num1+num2;

        System.out.println("the sum is: "+sum);

    }
}