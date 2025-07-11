package Methods;

import java.util.Scanner;

public class Ques4 {
    public static int digitSum(int num){
        int sum = 0;
        while(num != 0){
            int rem = num%10;
            sum+=rem;
            num = num/10;
        }
        return sum;
    }
    public static void main(String []args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Your number");
        int num = input.nextInt();
        int ans = digitSum(num);
        System.out.println(ans);
    }
}
