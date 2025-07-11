import java.util.Scanner;

public class Ques3{
    public static void main(String []args){
        System.out.println("Enter Your first number");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();

        System.out.println("Enter your Second Number:");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        int result = num1 ^ num2;
        System.out.println(result);
    }
}