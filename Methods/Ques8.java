import java.util.Scanner;

public class Ques8 {
    public static int reverseNum(int num){
        int ans = 0;
        while(num!=0){
            int rem = num%10;
            ans = ans * 10+rem;
            num = num/10;
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = input.nextInt();
        int ans = reverseNum(num);
        System.out.println(ans);
    }
}
