package Methods;

import java.util.Scanner;

public class Ques3 {
    public static int factorial(int num){
        int fact = 1;
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            int i=1;
            while(i<=num){
                fact*=i;
                i++;
            }
        }
        return fact;
    }
    public static void main(String []args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Your number");
        int num = input.nextInt();
        int ans = factorial(num);
        System.out.println(ans);
    }
}
