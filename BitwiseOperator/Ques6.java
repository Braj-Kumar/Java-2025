import java.util.Scanner;

public class Ques6{
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int result = n&~18;

        System.out.println("result is "+result);
    }
}