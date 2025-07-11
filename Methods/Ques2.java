package Methods;

import java.util.Scanner;

public class Ques2 {
    public static int addEvenNum(int n){
        int sum  = 0;
        int i=0;
        while(i<=n){
            if(i%2 == 0){
                sum+=i;
            }
            i++;
        }
        return sum;
    }
    public static void main(String []args){
        System.out.println("Enter Your Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result = addEvenNum(num);
        System.out.println(result);
    }
}
