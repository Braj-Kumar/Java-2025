package Methods;

import java.util.Scanner;

public class Ques5 {
    public static int Hcf(int a, int b){
        while(b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your number");
        int num1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your Second number");
        int num2 = input2.nextInt();
        int ans = Hcf(num1, num2);
        System.out.println(ans);
    }
}
