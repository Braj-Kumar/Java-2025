package Methods;

import java.util.Scanner;

public class Ques6 {
    public static int LowestCommonMultiply(int a, int b){
        int x = a;
        int y=b;
        while(b!=0){
            int rem = a%b;
            a = b;
            b=rem;
        }
        int hcf = a;
        int lcm = (x*y)/hcf;
        return lcm;

    }
    public static void main(String []args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Your first number");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Your Second Number");
        int num2 = input2.nextInt();

        int ans  = LowestCommonMultiply(num1, num2);
        System.out.println(ans);
    }
}
